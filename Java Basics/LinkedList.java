//Creation of a LinkeList

import java.util.*;
public class LinkedList{

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

    public void addBetween(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static int size=0;

    public void removeFirst(){
        if(head==null){
            System.out.print("There is nothing yo remove");
            return;
        }
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.print("There is nothing to remove");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=tail=null;
    }

    public int searchBruteForce(int key){
        Node temp=head;
        int i=0;
        while(temp.next!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helper(head.next, key);
        if(index==-1){
            return -1;
        }
        else{
            return index+1;
        }
    }
    public int searchRecursion(int key){
        return helper(head,key);
    }

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
    
    public void deleteFromEnd(int n){
        Node temp=head;
        if(size==n){
            head=head.next;
            return;
        }

        for(int i=0;i<=size-n-2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addBetween(1,444);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        // System.out.print("Enter the key you want to find : ");
        // int key=sc.nextInt();
        // System.out.print("The key is at the index : " + ll.searchBruteForce(key));
        // System.out.println("The key is at the index : " + ll.searchRecursion(key));
        // ll.reverse();
        // ll.print();
        System.out.print("Enter the index to delete from end : ");
        int n=sc.nextInt();
        ll.deleteFromEnd(n);
        ll.print();
    }
}