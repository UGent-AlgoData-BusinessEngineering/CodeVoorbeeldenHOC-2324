public class LinkedList {
    LinkedListNode head;

    public LinkedList() {
        head = null;
    }

    public void showList(){
        LinkedListNode node = head;
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public int length(){
        int counter = 0;
        LinkedListNode node = head;
        while(node != null){
            counter++;
            node.getNext();
        }
        return counter;
    }

    public void addNodeToStart(String addNodeData){
        LinkedListNode newNode = new LinkedListNode();
        newNode.setValue(addNodeData);
        newNode.setNext(head);
        head = newNode;
    }
}
