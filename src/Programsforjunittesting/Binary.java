package Programsforjunittesting;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte num = 0;
        byte res = 0;
        System.out.printf("Enter number: ");
        int temp = s.nextInt();
        num = (byte) (temp);
        int swapnum;
        swapnum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println("Before swapping the nibble " + temp);
        System.out.println("After swapping the nibble " + swapnum);
    }
}
