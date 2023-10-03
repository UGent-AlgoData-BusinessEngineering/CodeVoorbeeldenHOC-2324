public class LinkedList {
    LinkedListNode head;

    public LinkedList() {
        head = null;
    }

    public void showList(){
        LinkedListNode node = head;
        while(node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public int length(){
        LinkedListNode node = head;
        int counter = 0;
        while(node != null) {
            counter++;
            node = node.getNext();
        }
        return counter;
    }

    public void addNodeToStart(String addNodeData){
        LinkedListNode node = new LinkedListNode(addNodeData, head);
        head= node;

    }

    public static void main(String[] args) {

        LinkedList aList = new LinkedList();
        aList.addNodeToStart("Fred");
        aList.addNodeToStart("Tom");

        aList.showList();
    }
}
