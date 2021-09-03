package JavaPrograms;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        int num;
        int result;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("Entered number is--:" + num);
        if (num % 2 == 0) {
            System.out.println("enterer number is even");
        } else {
            System.out.println("entered number is odd");

        }
    }
}