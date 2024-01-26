package queue_circular_linked_list;

public class QueueLinkTest {
    public static void main(String[] args) {
        QueueLinkList<String> queue = new QueueLinkList<>();

        queue.enQueue("Abc");
        queue.enQueue("Xyz");
        queue.enQueue("Ghk");
        queue.enQueue("Iqp");
        queue.enQueue("Omn");
        queue.displayQueue();
        System.out.println();

        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}
