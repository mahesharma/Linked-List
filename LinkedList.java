class LinkedList {
    private Node head;
    public static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node insertNode(int data) {
        Node node = new Node(data);
        if(head == null) {
            head=node;
            return null;
        }
        Node newNode = head;
        while(newNode.next!=null) {
            newNode=newNode.next;
        }
        newNode.next = node;
        return newNode;
    }
    public Node traverseList() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
        return temp;
    }

    public static void main (String[] args) {
        LinkedList link = new LinkedList();
        link.insertNode(1);
        link.insertNode(2);
        link.insertNode(3);
        link.insertNode(4);
        link.traverseList();

    }
}