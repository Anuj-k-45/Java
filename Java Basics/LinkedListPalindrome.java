import java.util.*;
public class LinkedListPalindrome{

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

    public void addFirst(int data){
        //step1 - create new node
        Node newNode=new Node(data);
        //check base condition
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 - newNode = head
        newNode.next=head;
        //step3 - head = newnode
        head=newNode;
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

    public static int size=0;

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return;
    }

    public Node findMid(){
        Node slow=head;  //one jump (Tortoise)
        Node fast=head;  //two jumps (Rabbit)
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean check(){
        if(head==null || head.next==null){
            return true;
        }
        //step1 - find middle node
        Node mid=findMid();

        //step2 - reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;//right half head
        Node left=head;

        //step3 - check left half and right half
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
        LinkedListPalindrome ll= new LinkedListPalindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println("The given linkedlist is a palindrome : "+ll.check());
   }
}