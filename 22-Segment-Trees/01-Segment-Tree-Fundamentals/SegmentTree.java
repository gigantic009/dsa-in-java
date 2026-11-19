// Segment tree for range-sum queries and point updates.
public class SegmentTree {
    private final int[] tree; private final int n;
    public SegmentTree(int[] a) {
        n = a.length; tree = new int[Math.max(1, 4 * n)];
        if (n > 0) build(a, 1, 0, n - 1);
    }
    private void build(int[] a, int node, int l, int r) {
        if (l == r) { tree[node] = a[l]; return; }
        int m = l + (r - l) / 2;
        build(a, node * 2, l, m); build(a, node * 2 + 1, m + 1, r);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }
    public int sum(int left, int right) {
        validate(left, right);
        return query(1, 0, n - 1, left, right);
    }
    public void update(int index, int value) {
        if (index < 0 || index >= n) throw new IllegalArgumentException("Invalid index");
        update(1, 0, n - 1, index, value);
    }
    private void update(int node, int l, int r, int index, int value) {
        if (l == r) { tree[node] = value; return; }
        int m = l + (r - l) / 2;
        if (index <= m) update(node * 2, l, m, index, value);
        else update(node * 2 + 1, m + 1, r, index, value);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }
    private int query(int node, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) return tree[node];
        int m = l + (r - l) / 2, total = 0;
        if (ql <= m) total += query(node * 2, l, m, ql, qr);
        if (qr > m) total += query(node * 2 + 1, m + 1, r, ql, qr);
        return total;
    }
    private void validate(int l, int r) {
        if (n == 0 || l < 0 || r >= n || l > r) throw new IllegalArgumentException("Invalid range");
    }
}