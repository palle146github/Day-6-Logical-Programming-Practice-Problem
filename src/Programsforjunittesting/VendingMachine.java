package Programsforjunittesting;

import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class VendingMachine {
    public static void countCurrency(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 10, 5, 2, 1};
        int[] noteCounter = new int[8];

        // count notes using Greedy approach
        for (int i = 0; i < 8; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 8; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = s.nextInt();
        countCurrency(amount);
    }
}
