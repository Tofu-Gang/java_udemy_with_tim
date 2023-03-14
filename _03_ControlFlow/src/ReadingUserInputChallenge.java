import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1; i <= 5; i++) {
            double userNumber = getUserNumber(i);
            sum += userNumber;
        }
        System.out.println("The sum is " + sum);
    }

    public static double getUserNumber(int counter) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number #" + counter + ": ");
            String userInput = sc.nextLine();
            try {
                return Double.parseDouble(userInput);
            } catch(NumberFormatException e) {
                System.out.println("Invalid number!");
            }
        } while(true);
    }
}
