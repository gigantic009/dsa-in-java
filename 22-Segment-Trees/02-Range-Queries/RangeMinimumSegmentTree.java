// Segment tree supporting range-minimum queries and point updates.
public class RangeMinimumSegmentTree {
    private final int[] tree;
    private final int n;

    public RangeMinimumSegmentTree(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }
        n = arr.length;
        tree = new int[Math.max(1, 4 * n)];
        if (n > 0) {
            build(arr, 1, 0, n - 1);
        }
    }

    private void build(int[] arr, int node, int left, int right) {
        if (left == right) {
            tree[node] = arr[left];
            return;
        }
        int mid = left + (right - left) / 2;
        build(arr, node * 2, left, mid);
        build(arr, node * 2 + 1, mid + 1, right);
        tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
    }

    // Returns the minimum over the inclusive interval [left, right].
    public int query(int left, int right) {
        validateRange(left, right);
        return queryNode(1, 0, n - 1, left, right);
    }

    // Replaces the element at index with value.
    public void update(int index, int value) {
        if (index < 0 || index >= n) {
            throw new IllegalArgumentException("Invalid index.");
        }
        updateNode(1, 0, n - 1, index, value);
    }

    private void updateNode(int node, int left, int right, int index, int value) {
        if (left == right) {
            tree[node] = value;
            return;
        }
        int mid = left + (right - left) / 2;
        if (index <= mid) {
            updateNode(node * 2, left, mid, index, value);
        } else {
            updateNode(node * 2 + 1, mid + 1, right, index, value);
        }
        tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
    }

    private int queryNode(int node, int left, int right, int ql, int qr) {
        if (ql <= left && right <= qr) {
            return tree[node];
        }
        int mid = left + (right - left) / 2;
        int result = Integer.MAX_VALUE;
        if (ql <= mid) {
            result = Math.min(result, queryNode(node * 2, left, mid, ql, qr));
        }
        if (qr > mid) {
            result = Math.min(result, queryNode(node * 2 + 1, mid + 1, right, ql, qr));
        }
        return result;
    }

    private void validateRange(int left, int right) {
        if (n == 0 || left < 0 || right >= n || left > right) {
            throw new IllegalArgumentException("Invalid range.");
        }
    }

    public static void main(String[] args) {
        RangeMinimumSegmentTree tree = new RangeMinimumSegmentTree(new int[] {5, 2, 7, 1, 6});
        System.out.println(tree.query(1, 3)); // 1
        tree.update(3, 9);
        System.out.println(tree.query(1, 3)); // 2
    }
}
