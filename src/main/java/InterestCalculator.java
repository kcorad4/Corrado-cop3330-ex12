import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle amount;");
        double principle = sc.nextDouble();
        System.out.println("enter the interest rate;");
        double rate = sc.nextDouble();
        double ratePercent = rate/100;
        System.out.println("enter the number of years;");
        int years = sc.nextInt();

        double value = principle*(1+(ratePercent * years));
        System.out.println("after "+ years + " years at " + rate + "%, the investment will be worth " + value);
    }

}
