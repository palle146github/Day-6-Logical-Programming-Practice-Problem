package Logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any positive number ==> ");
        int number = s.nextInt();
        int sum = 0;
        for( int i = 1; i < number ; i++){
            if( number % i ==0 ){
                sum = sum + i;
            }
        }
        if ( sum == number ){
            System.out.println(number + " is a Perefect number");
        }
        else{
            System.out.println(number + " is not a Perfect number");
        }

    }
}
