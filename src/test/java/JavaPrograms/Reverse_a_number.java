package JavaPrograms;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {

        int given_number,reverse=0,remeinder;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        given_number=input.nextInt();
        while (given_number!=0)
        {
            remeinder=given_number%10;
            reverse=reverse*10+remeinder;
            given_number=given_number/10;
        }
        System.out.println("The reversed number is----->"+reverse);
    }
}
