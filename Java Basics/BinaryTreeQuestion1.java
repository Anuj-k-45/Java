/*Sayan really likes competitive programming. One day when he was solving a problem, he came up with an interesting tree. This tree is built as follows.

Initially, the tree has only one vertex with the number 1
— the root of the tree. Then, Vanya adds two children to it, assigning them consecutive numbers — 2
and 3
, respectively. After that, he will add children to the vertices in increasing order of their numbers, starting from 2
, assigning their children the minimum unused indices. As a result, Sayan will have an infinite tree with the root in the vertex 1
, where each vertex will have exactly two children, and the vertex numbers will be arranged sequentially by layers.

Part of Sayan's tree.
Sayan wondered what the sum of the vertex numbers on the path from the vertex with number 1
to the vertex with number n
in such a tree is equal to. Since Sayan doesn't like counting, he asked you to help him find this sum.*/

import java.util.*;
public class BinaryTreeQuestion1{

    public static void sum(long target){
        long sum=0;
        while(target!=1){
            sum=target+sum;
            target=target/2;
        }
        System.out.println(sum+1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        long[] tests=new long[test];
        for(int i=0;i<test;i++){
            tests[i]=sc.nextLong();
        }
        for(int i=0;i<test;i++){
            sum(tests[i]);
        }
    }
}