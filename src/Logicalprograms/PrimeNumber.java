package Logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
        public static void main(String[] args){
            int number, count=0;
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            for(int i = 2; i <= number; i++){
                if(number % i == 0){
                    count = count + 1;
                }
            }
            if ( count >= 2){
                System.out.println(number + " is a Prime Number");
            }
            else{
                System.out.println(number + " is not a Prime Number");
            }
        }
}
