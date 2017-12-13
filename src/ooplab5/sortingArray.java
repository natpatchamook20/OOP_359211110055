package ooplab5;

import java.util.Scanner;

public class sortingArray {

    private static final int MAX = 10;
    private static int number[]=new int [MAX];
    public static void main(String[] args) {
        inputData(number,number.length);
        System.out.println("Before sorting: ");
        showData(number,number.length);
        findMaxData(number);
        // findMinData(number);
        // SortingData(number);
    }

    private static void SortingData(int[] number) {
    }

    private static void findMinData(int[] number) {
    }

    private static void findMaxData(int[] number) {
        int min = number[0];
        for (int i=0;i<number.length;i++){
            if (min>=number[i])
                min = number[i];
        }//for
        System.out.println("The maximum data: " + min);
    }//findMaxData

    private static void showData(int[] number, int length) {
        System.out.println("Data in array: ");
        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }

    private static void inputData(int[] number, int length) {

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.print("Enter an integer["+i+"]: ");
            number[i] = scanner.nextInt();
        }
    }//inputData
}