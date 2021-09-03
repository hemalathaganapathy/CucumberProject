package JavaPrograms;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        boolean flag = false;

        Scanner input=new Scanner(System.in);
        System.out.println("enter the inputs---->");
        int result=input.nextInt();
        for(int i=2;i<=result/2;i++)
        {
            if(result%i==0)
            {
                flag =true;
             //  break;
            }

        }
        if(!flag)
        {
            System.out.println("entered number is prime");
        }
        else
        {
            System.out.println("not prime");
        }

    }
}
