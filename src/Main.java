public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000.0; // Starting balance
        double monthlyInterestRate = 0.17 ; // monthly 17% interest rate

        // Calculate interest after one month
        double oneMonthInterest = initialBalance * monthlyInterestRate;

        // Calculate interest after two months
        double twoMonthsInterest = (initialBalance + oneMonthInterest) * monthlyInterestRate;

        // Display the results
        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Interest Due After One Month: $" + oneMonthInterest);
        System.out.println("Interest Due After Two Months: $" + twoMonthsInterest);

    }
}