public class WhileLoopChallenge {
    public static void main(String[] args) {
        int start = 5;
        int end = 20;
        int oddCount = 0;
        int evenCount = 0;
        int i = start;

        while (i <= end && evenCount < 5) {
            if (isEvenNumber(i)) {
                System.out.println("Even number: " + i);
                evenCount++;
            } else {
                oddCount++;
            }
            i++;
        }
        System.out.println("Total number of even numbers was " + evenCount);
        System.out.println("Total number of odd numbers was " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
