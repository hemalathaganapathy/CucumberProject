package JavaPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int remainder, reverse = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int given_number = input.nextInt();
        int temp = given_number;
        while (given_number > 0) {
            remainder = given_number % 10;
            reverse = reverse * 10 + remainder;
            given_number = given_number / 10;

        }
        if (temp == reverse) {
            System.out.println("palindrome");

        } else {
            System.out.println("not a palindrome");
        }
    }
}