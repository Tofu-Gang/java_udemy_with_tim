public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number -= digit;
                number /= 10;
            }
            return sum;
        }
    }
}
