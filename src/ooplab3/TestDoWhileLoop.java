package ooplab3;

import java.util.Scanner;

public class TestDoWhileLoop {
    public  static void main (String[] args){

// do-while
        int n=1;
        do{


//statemnt

            System.out.print(n+" ");
        } while (++n <= 10);
        //correct Password
        int pin = 1234;
        int count = 0;
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your password : ");
            input = scanner.nextInt();
            count++;
            if(input ==pin){

                System.out.println("Your password is correct. ");break;
            }
            if (count ==30){

                System.out.print("System Error. ");break;
            }
        }while (input != pin);





    }//main
}//class