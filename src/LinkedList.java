public class LinkedList {
    Node head=new Node();
    Node n = new Node();//Traversing node
    public void insertAtLast(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null) head = node;
        n=head;
        while (n.next!=null) n = n.next;
        n.next = node;

    }
    public void insertAtFirst(int data){
        Node node = new Node();
        node.data = data;
        n=head;
        if(n.next != null) {
            n=n.next;
            //node.next=n;
            System.out.println(n.data);
        }


    }
    public void insertAt(int data,int index){
        Node node = new Node();
        node.data = data;
    }
    public void show(){
        if(head!=null) {
            n = head;
            while (n.next != null) {
                n = n.next;
                System.out.print(n.data + "-> ");
            }
            System.out.println();
        }
    }
    public void showHead(){
        if(head!=null) {
            n=head;
            if(n.next != null) {
                n = n.next;
                System.out.print(n.data + "-> ");
            }
            System.out.println();
        }
    }
    public void showTail() {
        if(head!=null) {
            n = head;
            while (n.next != null) n = n.next;
            System.out.print(n.data + "-> ");
            System.out.println();
        }
    }
}
