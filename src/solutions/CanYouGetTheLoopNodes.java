package solutions;


public class CanYouGetTheLoopNodes {
    public int loopSize(Node node) {
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                return calculateLoopSize(slow);
            }
        }

        return 0;
    }

    private int calculateLoopSize(Node meetPoint) {
        int size = 1;
        Node current = meetPoint.getNext();

        while (current != meetPoint) {
            size++;
            current = current.getNext();
        }

        return size;
    }
}