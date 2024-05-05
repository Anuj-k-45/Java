//You're given an array A consisting of n elements. It is given that all the numbers except one in this array are the same. Can you determine the index of the impostor?

import java.util.Scanner;

public class ImposterQuestion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements : ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] frequencyArray = new int[101];

        for (int num : array) {
            frequencyArray[num]++;
        }

        int impostor = 0;
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] == 1) {
                impostor = i;
                break;
            }
        }

        int impostorIndex = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == impostor) {
                impostorIndex = i + 1;
                break;
            }
        }

        System.out.println(impostorIndex);
    }
}

