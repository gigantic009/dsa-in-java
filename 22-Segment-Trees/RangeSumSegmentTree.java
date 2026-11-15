public class RangeSumSegmentTree {
    private final int[] tree;
    private final int size;

    public RangeSumSegmentTree(int[] arr) {
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
        if (size == 0 || left < 0 || right >= size || left > right) {
            throw new IllegalArgumentException("Invalid range");
        }

        return query(1, 0, size - 1, left, right);
    }

    private int query(int node, int start, int end, int left, int right) {
        if (right < start || end < left) {
            return 0;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = start + (end - start) / 2;
        int a = query(node * 2, start, mid, left, right);
        int b = query(node * 2 + 1, mid + 1, end, left, right);
        return a + b;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        RangeSumSegmentTree segmentTree = new RangeSumSegmentTree(arr);
        System.out.println(segmentTree.query(1, 3));
    }
}
