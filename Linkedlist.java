public class Linkedlist{
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
    Node newNode = new Node(data); // is step m constructor call hoggaa
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}
public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next = newNode;  //may be due to static variable
    tail = newNode;       // isko already null se initialize kr rkha h
}
public void print(){
 Node temp = head;
 while(temp !=null){
    System.out.print(temp.data);
    temp = temp.next;
 }
 System.out.println();
}
public void add(int idx , int data){
if(idx==0){
    addFirst(data);
    return;
}
Node newNode = new Node(data); 
size++;
Node temp = head;
int i=0;
while(i<idx-1){
    temp=temp.next;     //poiniting next iteration 
    i++;
}
newNode.next = temp.next; //it is pointing to next
temp.next=newNode;
}
public int removeFirst(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    } else if(size==1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val = head.data;
    head = head.next;
     size--;
    return val;  
}
public int removeLast(){
    if(size==0){
        System.out.println("ll is empty");
    } else if(size==1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev = head;
    for(int i=0; i<size-2; i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
public int itrSearch(int key){  //itrSearch is non-static method
    Node temp = head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
    temp = temp.next;
    i++;
    }
    return -1;
}
public int recSearch(int key){
    return helper(head,key);
}
public int helper(Node head, int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key); //function recall
    if(idx==-1){
        return -1;
    }
    return idx+1;    //ye shyd vaps aate time idx+1 kr dia
}
public void reverse(){
    Node prev = null;
    Node curr = tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev = curr;
        curr=next;
    }
    head=prev;
}
public void deleteNthfromEnd(int n){
    //calculate size
    int sz=0;
    Node temp = head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){          //agr head hi delte krna pd jaye;
        head=head.next;
        return;
    }
    //to reach at nth node from end sz-n
    int i=1;
    int iToFind=sz-n;
    Node prev = head;   //prev variable h node type ka jo head ko point kr rha
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}
public static void main(String args[]){
    Linkedlist ll = new Linkedlist();
   ll.addFirst(2);
   ll.addFirst(1);
   ll.addLast(3);
   ll.addLast(4);
  // ll.add(2,9);
   ll.print();
   //System.out.println(ll.size);
    //ll.removeFirst();
    //ll.print();
    //ll.removeLast();
    //ll.print();
   // System.out.println(ll.itrSearch(3));
   // System.out.println(ll.itrSearch(10));
   // System.out.println(ll.recSearch(3));
   // System.out.println(ll.recSearch(10));
   //ll.reverse();
   //ll.print();
   ll.deleteNthfromEnd(2);
   ll.print();
}
}