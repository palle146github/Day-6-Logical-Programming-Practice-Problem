package Programsforjunittesting;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println("Enter any number to represent in Binary form ");
        Scanner s = new Scanner(System.in);
        int decimal = s.nextInt();
        int binary[] = new int[40];
        int index = 0;
        System.out.println("Binary form of " + decimal + " is");
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}