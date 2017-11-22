package ooplab2;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class TestInput {

    public  static  void  main (String[] args) throws IOException {

        //  BufferedReader

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input Data by using BufferedReader

        System.out.println("What is yout name?: ");
        String name = reader.readLine();
        System.out.println("You name is "+name);
        System.out.println("How old are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are "+age+"years old. ");


        //Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from?:  ");
        String address = scanner.nextLine();
        System.out.println("You came from "+address);
        System.out.println("What is your weight?: ");
        double weight = scanner.nextDouble();
        System.out.println("You weight: "+weight);

    }//main








}// class