public class LinkedListNode {
    private String value;
    private LinkedList next;

    public LinkedListNode() {
        this.value = null;
        this.next = null;

    }

    public LinkedListNode(String value, LinkedList next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}
