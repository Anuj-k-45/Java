//Fractional Knapsack using greedy approch

import java.util.*;
public class FractionalKnapSack{

    public static void fractionalKnapsack(int weight[],int value[],float capacity){
        ArrayList<Integer> knapSack=new ArrayList<>();
        float table[][]=new float[value.length][4];
        for(int i=0;i<value.length;i++){
            table[i][0]=(float)(value[i]/weight[i]);
            table[i][1]=weight[i];
            table[i][2]=value[i];
            table[i][3]=i;
        }
        Arrays.sort(table,Comparator.comparingDouble(a->a[0]));
        float totalval=0;
        for(int i=value.length-1;i>=0;i--){
            if(capacity>table[i][1]){
                capacity=capacity-table[i][1];
                totalval=totalval+table[i][2];
                knapSack.add((int)table[i][3]);
            }
            else{
                totalval=totalval+capacity*table[i][0];
                knapSack.add((int)table[i][3]);
                break;
            }
        }
        System.out.println("Maximum value : " + totalval);
        System.out.print("Elements added : ");
        for(int i=0;i<knapSack.size();i++){
            System.out.print("E" + knapSack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int weight[]={10,20,30,60,100};
        int value[]={60,100,120,5,1};
        System.out.print("Total capacity of KnapSack : ");
        float capacity=sc.nextFloat();
        fractionalKnapsack(weight,value,capacity);
    }
}