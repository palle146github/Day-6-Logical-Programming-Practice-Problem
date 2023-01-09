package Logicalprograms;

import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        int number;
        double rand = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of coupons to be generated");
        number = sc.nextInt();
        int randCouponNumbers = 0;
        int distinctCoupon = 0 ;
        for ( int i = 1; i <= number; i++){
            randCouponNumbers = ( int )(( Math.random() * 1000) % 1000);
                if( distinctCoupon == randCouponNumbers ){
                    System.out.println( "Duplicate coupon number " + randCouponNumbers);
                }
                else{
                    System.out.println(randCouponNumbers);
                    distinctCoupon = randCouponNumbers;
                }
        }
    }
}
