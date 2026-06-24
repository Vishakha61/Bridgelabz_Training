public class MyQueue<T> {

    private static class Node<T> {

        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public void enqueue(T value) {

        Node<T> newNode = new Node<>(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    public T dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }

        T value = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        return value;
    }

    public T peek() {

        if (isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }

        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}