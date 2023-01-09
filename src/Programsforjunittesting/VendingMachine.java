package Programsforjunittesting;

import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class VendingMachine {
    public static void countCurrency(int amount) {
        int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[10];

        // count notes using Greedy approach
        for (int i = 0; i < 10; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 10; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
    public static void main(String argc[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount");
        int amount = s.nextInt();
        countCurrency(amount);
    }
}
