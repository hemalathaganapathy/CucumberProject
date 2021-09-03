package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstterm=0,secondterm=1,nextterm;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the inputs");
        int fibonacci_number=input.nextInt();
        for(int i=0;i<=fibonacci_number;i++)
        {
            System.out.print(firstterm+",");
            nextterm=firstterm+secondterm;
            firstterm=secondterm;
            secondterm=nextterm;
        }
        System.out.println("The Fibonacci Series are--->");


    }
}
