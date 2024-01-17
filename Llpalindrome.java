public class Llpalindrome{
    public static class Node{
        int data;
        Node next;    //reference/pointer jo agle node ki trf link bnate h
    public Node(int data){    //constructor of Node class
        this.data=data;
        this.next=null;
    }
    }
    public static Node head; //as a property define kr dia aise smj node ek data type as a pointer
    public static Node tail; // jisme head node aaya tail node aaya aur null h
    public static int size;  //by default 0
public void addFirst(int data){
    Node newNode = new Node(data); // is step m constructor call hoggaa aur ek new node m data
    size++;                        // aur reference dono aayenge aur reference pure k pure next node ko
    if(head==null){                // point krta h
        head=tail=newNode;
        return;
    }
    newNode.next = head;   //
    head = newNode;
}
public static Node findMid(Node head){
    Node slow = head;
    Node fast = head;
    while(fast!=null &&fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
public static boolean checkPalindrome(){
    if(head==null ||head.next==null){       //corner case
        return true;
    }
    Node midNode = findMid(head);
    Node prev=null;
    Node curr=midNode;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;
    Node left=head;
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
}
public static void main(String args[]){
    Llpalindrome ll = new Llpalindrome();
   ll.addFirst(1);
   ll.addFirst(2);
   ll.addFirst(2);
   ll.addFirst(1);
   System.out.println(checkPalindrome());
}
}