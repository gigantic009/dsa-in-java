// Segment tree for inclusive range-sum queries.
public class RangeSumSegmentTree {
    private final int[] tree;
    private final int size;

    public RangeSumSegmentTree(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }
        size = arr.length;
        tree = new int[Math.max(1, 4 * size)];
        if (size > 0) {
            build(arr, 1, 0, size - 1);
        }
    }

    private void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
            return;
        }
        int mid = start + (end - start) / 2;
        build(arr, node * 2, start, mid);
        build(arr, node * 2 + 1, mid + 1, end);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public int query(int left, int right) {
        validateRange(left, right);
        return queryNode(1, 0, size - 1, left, right);
    }

    public void update(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Invalid index.");
        }
        updateNode(1, 0, size - 1, index, value);
    }

    private void updateNode(int node, int start, int end, int index, int value) {
        if (start == end) {
            tree[node] = value;
            return;
        }
        int mid = start + (end - start) / 2;
        if (index <= mid) {
            updateNode(node * 2, start, mid, index, value);
        } else {
            updateNode(node * 2 + 1, mid + 1, end, index, value);
        }
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    private int queryNode(int node, int start, int end, int left, int right) {
        if (left <= start && end <= right) {
            return tree[node];
        }
        int mid = start + (end - start) / 2;
        int total = 0;
        if (left <= mid) {
            total += queryNode(node * 2, start, mid, left, right);
        }
        if (right > mid) {
            total += queryNode(node * 2 + 1, mid + 1, end, left, right);
        }
        return total;
    }

    private void validateRange(int left, int right) {
        if (size == 0 || left < 0 || right >= size || left > right) {
            throw new IllegalArgumentException("Invalid range.");
        }
    }

    public static void main(String[] args) {
        RangeSumSegmentTree tree = new RangeSumSegmentTree(new int[] {2, 4, 6, 8, 10});
        System.out.println(tree.query(1, 3)); // 18
        tree.update(2, 1);
        System.out.println(tree.query(1, 3)); // 13
    }
}
