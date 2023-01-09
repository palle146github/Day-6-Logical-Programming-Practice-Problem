package Programsforjunittesting;

public class MonthlyPayments {
    public static void main(String[] args) {
        double principalAmount = Double.parseDouble(args[0]);
        int years = (int) Double.parseDouble(args[1]);
        double rateInterest = Double.parseDouble(args[2]);
        int n = 12 * years;
        double r = rateInterest / (12 * 100);
        double monthlyPayment = (principalAmount * r) / (1 - Math.pow((1 + r), (-n)));
        System.out.println("Monthly payment is ==> " + monthlyPayment);
    }
}
