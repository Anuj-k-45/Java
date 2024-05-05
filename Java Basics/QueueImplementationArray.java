import java.util.*;
public class QueueImplementationArray{
    public static class Queue{
        static int arr[];
        static int size=100;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full, cannot add the current new extra data : " + data);
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
    
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty, nothing to remove");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
    
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(0);
        q.add(100);
        q.remove();
        System.out.println(q.peek());
    }
}