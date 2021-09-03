package JavaPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorial=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Inputs");
        int result=input.nextInt();
        for(int i=1;i<=result;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("The Factorial No.of "+result+"="+factorial);
    }
}
