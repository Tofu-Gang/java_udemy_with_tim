public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        printResult(0);
        printResult(1);
        printResult(2);
        printResult(3);
        primeCount(10, 50);
    }

    public static void primeCount(int minNumber, int maxNumber) {
        if (minNumber < 0 || minNumber > 1000 || maxNumber < 0 || maxNumber > 1000 || minNumber >= maxNumber) {
            System.out.println("minNumber and maxNumber must be between 0 and 1000; minNumber must be less than maxNumber");
        } else {
            int count = 0;
            for (int i = minNumber; i <= maxNumber; i++) {
                if (isPrime(i)) {
                    System.out.println("number " + i + " is a prime numbers");
                    count++;
                    if (count == 3) {
                        System.out.println("Found 3 - Exiting for loop");
                        break;
                    }
                }
            }
            System.out.println("Total number of prime numbers between " + minNumber + " and " + maxNumber + " is " + count);
        }
    }

    public static void printResult(int wholeNumber) {
        System.out.println("" + wholeNumber + " is " + (isPrime(wholeNumber) ? "" : "NOT ") + "a prime number");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 1) {
            // negative numbers, zero and one by definition are not prime
            return false;
        } else {
            for (int i = 2; i < wholeNumber; i++) {
                if (wholeNumber % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
