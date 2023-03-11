public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000 && count < 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("Found a match = " + i);
            }
        }
        System.out.println("Sum = " + sum);
    }
}
