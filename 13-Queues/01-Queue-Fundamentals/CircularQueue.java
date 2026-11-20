// Circular queue reuses array positions after removals.
public class CircularQueue {
    private final int[] array;
    private int front;
    private int size;

    public CircularQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        array = new int[capacity];
    }

    public boolean offer(int value) {
        if (size == array.length) {
            return false;
        }

        int rear = (front + size) % array.length;
        array[rear] = value;
        size++;
        return true;
    }

    public int poll() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = array[front];
        front = (front + 1) % array.length;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
