package Programsforjunittesting;

import java.util.Scanner;

public class TemperaturConversion {
    public static void main(String[] args) {
        System.out.println( "1. Celsius to Fahrenheit:");
        System.out.println( "2. Fahrenheit to Celsius:");
        System.out.println( "Choose one option");
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        System.out.println("Enter temperature");
        int temperature = s.nextInt();


        double temperatureConversion = 0;
        switch( option ){
            case 1:
                temperatureConversion = ( temperature * 9 / 5 ) + 32 ;
                break;
            case 2:
                temperatureConversion = ( temperature - 32 ) * 5 / 9 ;
                break;
            default:
                System.out.println("Invalid Selection");
        }
        System.out.println(temperatureConversion);


    }
}
