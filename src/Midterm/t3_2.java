package Midterm;
import java.util.Scanner;
public class t3_2 {
    private static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int total = 0, vat = 0;
        String id = getID();
        System.out.println(id);
        String name = getName();
        System.out.println(name);
        int salary = getSalary();
        System.out.println(salary);
        int overtime = getOverTime();
        System.out.println(overtime);
        total = salary+overtime;
        System.out.println("Summation Salary and OverTime : "+total);
        if(total>=100000)
            System.out.println("Your Pay Price Vat : "+ total/10);
        else if(total>=70000)
            System.out.println("Your Pay Price Vat : "+ total/7);
        else if(total>=50000)
            System.out.println("Your Pay Price Vat : "+ total/5);
        else if(total>=30000)
            System.out.println("Your Pay Price Vat : "+ total/3);
        else
            System.out.println("Your Pay Price Vat : "+ total/1);
    }
    private static String getID(){
        String id;
        System.out.print("Enter ID : ");
        id = sc.nextLine();
        return id;
    }
    private static String getName(){
        String name;
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        return name;
    }
    private static int getSalary(){
        int salary;
        System.out.print("Enter Salary : ");
        salary = sc.nextInt();
        return salary;
    }
    private static int getOverTime(){
        int overtime;
        System.out.print("Enter OverTime : ");
        overtime = sc.nextInt();
        return overtime;
    }
}

