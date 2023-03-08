public class TheForLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        double amount = 10000.0;
        for (double interestRate = 2.0; interestRate <= 5.0; interestRate++) {
            double interestAmount = calculateInterest(amount, interestRate);
            System.out.println("" + amount + " at " + interestRate + "% interest = " + interestAmount);
        }

        amount = 100.0;
        for (double interestRate = 7.5; interestRate <= 10.0; interestRate += 0.25) {
            double interestAmount = calculateInterest(amount, interestRate);
            if (interestAmount > 8.5) {
                break;
            } else {
                System.out.println("$" + amount + " at " + interestRate + "% interest = $" + interestAmount);
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
