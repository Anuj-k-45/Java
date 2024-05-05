//Detect and remove the cycle if present in the provided linkedList
//The algo used here is called "Floyds cycle detection"

import java.util.*;
public class LinkedListCycleRemove {

    public static class Node {
        int data;
        Node next;

        public Node(int data) { // Constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int size = 0;

    public void addLast(int data) {
        // step1 - Create new node
        Node newNode = new Node(data);
        // check base condition
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode = tail
        tail.next = newNode;
        // step3 - tail = newNode
        tail = newNode;
    }

    public void print() {
        size = 0;
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            size++;
        }
        System.out.println("null");
        System.out.println("The total number of nodes is: " + size);
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
    Node slow = head;
    Node fast = head;
    Node prev = null;

    // Detect the meeting point
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            // Cycle detected, break the cycle
            break;
        }
    }

    // If no cycle is found, return
    if (fast == null || fast.next == null) {
        return;
    }

    // Move one pointer back to the head
    slow = head;

    // Find the start of the cycle
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Break the cycle
    prev.next = null;
}


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedListCycleRemove ll = new LinkedListCycleRemove(); // Fix: Create an instance of LinkedListCycleRemove, not LinkedList note: write in the format -----> className name=new className();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        Node cycle=head.next.next.next;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=cycle;

        if(!ll.detectCycle()){
            System.out.print("There is no cycle in the given LinkedList");
        }
        else{
            ll.removeCycle();
            ll.print();
        }
    }
}


//Chatgpt correction
/*import java.util.Scanner;

public class LinkedListCycleRemove {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (slow != null && fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Cycle detected, break the cycle
                prev.next = null;
                break;
            }
        }
    }

    public static void main(String args[]) {
        LinkedListCycleRemove ll = new LinkedListCycleRemove();

        for (int i = 1; i <= 9; i++) {
            ll.addLast(i);
        }

        // Creating a cycle for testing
        Node cycleNode = head.next.next.next; // Assuming this is the node where the cycle starts
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = cycleNode; // Creating a cycle

        if (!ll.detectCycle()) {
            System.out.println("There is no cycle in the given LinkedList");
        } else {
            ll.removeCycle();
            System.out.println("Cycle removed:");
            ll.print();
        }
    }
}
*/




//Chatgpt correction
/*import java.util.*;

public class LinkedListCycleRemove {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("The total number of nodes is: " + size);
    }

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
    Node slow = head;
    Node fast = head;
    Node prev = null;

    // Detect the meeting point
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (fast == slow) {
            break;
        }
    }

    // If no cycle is found, return
    if (fast == null || fast.next == null) {
        return;
    }

    // Move one pointer back to the head
    slow = head;
    
    // Find the start of the cycle
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // Break the cycle
    prev.next = null;
}


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedListCycleRemove ll = new LinkedListCycleRemove();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // Creating a cycle for testing
        Node cycleNode = head.next.next; // Assuming this is the node where the cycle starts
        tail.next = cycleNode; // Creating a cycle
        ll.print();
        if (ll.detectCycle() == false) {
            System.out.print("There is no cycle in the given LinkedList");
        } else {
            ll.removeCycle();
            ll.print();
        }
    }
}*/



