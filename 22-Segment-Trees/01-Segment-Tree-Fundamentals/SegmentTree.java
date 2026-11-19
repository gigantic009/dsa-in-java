// Segment tree for range-sum queries and point updates.
public class SegmentTree {
    private final int[] tree;
    private final int n;

    public SegmentTree(int[] arr) {
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

    public int sum(int left, int right) {
        validate(left, right);
        return query(1, 0, n - 1, left, right);
    }

    public void update(int index, int value) {
        if (index < 0 || index >= n) {
            throw new IllegalArgumentException("Invalid index");
        }
        update(1, 0, n - 1, index, value);
    }

    private void update(int node, int left, int right, int index, int value) {
        if (left == right) {
            tree[node] = value;
            return;
        }

        int mid = left + (right - left) / 2;
        if (index <= mid) {
            update(node * 2, left, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, right, index, value);
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

    private void validate(int left, int right) {
        if (n == 0 || left < 0 || right >= n || left > right) {
            throw new IllegalArgumentException("Invalid range");
        }
    }
}
