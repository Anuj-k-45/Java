//Circular queue

import java.util.*;
public class QueueCyclicArray{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        //check empty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        //check full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full, the current new extra data cannot be added : " + data);
                return;
            }
            //adding 1st element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove 1st element
        public static int remove(){
            if(isEmpty()){
                System.out.println("Nothing to remove, the queue is empty!");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }


    public static void main(String args[]){
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.print("\nThe array in reality was : [ ");
        for(int i=0;i<q.size;i++){
            System.out.print(q.arr[i] + " ");
        }
        System.out.print("]");
    }
}