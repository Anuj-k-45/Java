import java.util.*;
public class LinkedListBasicStructure{

    public static class Node{
        int data;
        Node next;

        public Node(int data){ //Constructor
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int size=0;

    public void addLast(int data){
        //step1 - Create new node
        Node newNode=new Node(data);
        //check base condition
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 - newNode = tail
        tail.next=newNode;
        //step3 - tail = newNode
        tail=newNode;
    }

    public void print(){
        size=0;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            size++;
        }
        System.out.println("null");
        System.out.println("The total number of nodes is : " + size);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        className ll=new className();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.print();
    }
}