public class LinkedListNode {
    private String value;
    private LinkedListNode next;

    public LinkedListNode() {
        this.value = null;
        this.next = null;

    }

    public LinkedListNode(String value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
