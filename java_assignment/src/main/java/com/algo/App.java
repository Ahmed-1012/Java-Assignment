package com.algo;
import java.util.Scanner;

public class App 
{
    /*
        method for printing numbers form 10 to 1
    */
    public static void printNumbersDescending()
    {
        for(int i=10;i>0;i--)
            System.out.println(i);
    }

    /*
        method for printing the cardinality of numbers form 1 to 10
    */
    public static void printEvenOrOdd()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
                System.out.println(i+" ->Odd");
            else
                System.out.println(i+" ->Even");
        }
    }

    /*
        method for printig the type of the number ethier positive,negative or zero

        @param number is the number to chick 
        @return the type as string
    
    */
    public static String checkNumberType(int number)
    {
        if(number>0)
            return "Positive";
        else if(number<0)
            return "Negative";
        else
            return "Zero";
    }

    
    /*
        method for calculating the sum of two numbers

        @param number1 the first number
        @param number2 the second number
        @return the sum of the two numbers
    */
    public static int calculateSum(int number1, int number2)
    {
        return number1+number2;
    }

    // used ChatGPT for this method (this method only)
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main( String[] args )
    {
        Boolean close=false;
        int choice,num1,num2;
        Scanner scan=new Scanner(System.in);
        do
        {
            System.out.println("=======================================");
            System.out.println("1- Print numbers form 10 to 1");
            System.out.println("2- Print Even/odd report");
            System.out.println("3- check number type");
            System.out.println("4- Calculate sum between 2 numbers");
            System.out.println("5- Exit");
            System.out.println("=======================================");
            choice=scan.nextInt();
            switch (choice)
            {
                case 1:
                    clearScreen();
                    printNumbersDescending();    
                break;
                case 2:
                    clearScreen();
                    printEvenOrOdd();
                break;
                case 3:
                    clearScreen();
                    System.out.print("enter a number to check its type: ");
                    num1=scan.nextInt();
                    System.out.println("the type of the number is "+checkNumberType(num1));
                break;
                case 4:
                    clearScreen();
                    System.out.print("enter the first number: ");
                    num1=scan.nextInt();
                    System.out.print("enter the second number: ");
                    num2=scan.nextInt();
                    System.out.println("the sum is: "+calculateSum(num1, num2));
                break;
                case 5:
                    clearScreen();
                    close=true;
                    System.out.println("exiting ...");
                break;
                default:
                    clearScreen();
                    System.out.println("enter a valid number");
                break;
            }       
        }while(!close);

        scan.close();
    }
}
