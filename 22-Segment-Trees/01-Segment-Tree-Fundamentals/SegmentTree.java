// Segment tree for range-sum queries and point updates.
public class SegmentTree {
    private final int[] tree;
    private final int n;

    public SegmentTree(int[] arr) {
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
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    // Returns the sum of the inclusive range [left, right].
    public int sum(int left, int right) {
        validateRange(left, right);
        return query(1, 0, n - 1, left, right);
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
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    private int query(int node, int left, int right, int ql, int qr) {
        if (ql <= left && right <= qr) {
            return tree[node];
        }
        int mid = left + (right - left) / 2;
        int total = 0;
        if (ql <= mid) {
            total += query(node * 2, left, mid, ql, qr);
        }
        if (qr > mid) {
            total += query(node * 2 + 1, mid + 1, right, ql, qr);
        }
        return total;
    }

    private void validateRange(int left, int right) {
        if (n == 0 || left < 0 || right >= n || left > right) {
            throw new IllegalArgumentException("Invalid range.");
        }
    }

    public static void main(String[] args) {
        SegmentTree tree = new SegmentTree(new int[] {1, 3, 5, 7, 9, 11});
        System.out.println(tree.sum(1, 3)); // 15
        tree.update(1, 10);
        System.out.println(tree.sum(1, 3)); // 22
    }
}
