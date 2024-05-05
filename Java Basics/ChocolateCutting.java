//Chocolate cutting problem using greedy approch

import java.util.*;
public class ChocolateCutting{

    public static int costCalculate(int Hcut[],int Vcut[]){
        int cost=0;
        Arrays.sort(Vcut);
        Arrays.sort(Hcut);
        int i=Vcut.length-1,j=Hcut.length-1;
        int Hpieces=1,Vpieces=1;
        while(i>=0 && j>=0){
            if(Vcut[i]<=Hcut[j]){
                cost=cost+Hcut[j]*Vpieces;
                j--;
                Hpieces++;
            }
            
            else{
                cost=cost+Vcut[i]*Hpieces;
                i--;
                Vpieces++;
            }
        }
        
        while(i>=0){
            cost=cost+Vcut[i]*Hpieces;
            i--;
            Vpieces++;
        }

        while(j>=0){
            cost=cost+Hcut[j]*Vpieces;
            j--;
            Hpieces++;
        }

        return cost;
    }

    public static void main(String args[]){
        int Hcut[]={4,1,2};
        int Vcut[]={2,1,3,1,4};
        System.out.println("The minimum cost of cutting the chocolate in single pieces is : " + costCalculate(Hcut,Vcut));
    }
}