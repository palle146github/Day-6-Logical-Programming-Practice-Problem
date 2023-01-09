package Logicalprograms;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number");
        number = sc.nextInt();
        System.out.println("Reverse of a number is ");
        int n1, reverse = 0;
        while( number != 0) {
            n1 = number % 10;
            reverse = reverse * 10 + n1;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
