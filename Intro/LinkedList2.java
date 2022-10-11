public class LinkedList2 {
    LinkedListNode head;
    LinkedListNode current;
    LinkedListNode next;

    public LinkedList2() {

        head = null;
        current = null;
        next = null;
    }

    public void showList(){
        LinkedListNode node = head;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public int length(){
        int counter = 0;
        LinkedListNode node = head;
        while(node != null){
            counter++;
            node = node.next;
        }
        return counter;
    }

    public void addNodeToStart(String addNodeData){
        LinkedListNode newNode = new LinkedListNode();
        newNode.value = addNodeData;
        newNode.next = head ;
        head = newNode;
    }

    class LinkedListNode {
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


    }
}
