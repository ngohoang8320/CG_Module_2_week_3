package queue_circular_linked_list;

public class QueueLinkList<T> {
    private Node front;
    private Node rear;

    public void enQueue(T data) {
        Node temp = new Node(data);
        if (rear != null) {
            rear.link = temp;
            rear = temp;
            rear.link = front;
        } else {
            front = rear = temp;
            rear.link = front;
        }
    }

    public void deQueue() {
        if (front != null) {
            front = front.link;
            rear.link = front;
        } else {
            throw new RuntimeException("No more.");
        }
    }

    public void displayQueue() {
        Node loop = front;
        do {
            System.out.printf(loop.data + "\t");
            loop = loop.link;
        }
        while (loop.link != front.link);
    }

    private class Node {
        private T data;
        private Node link;

        public Node(T data) {
            this.data = data;
        }
    }
}
