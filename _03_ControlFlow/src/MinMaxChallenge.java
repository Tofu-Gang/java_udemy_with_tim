import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number or any character to quit: ");
            try {
                double userNumber = Double.parseDouble(sc.nextLine());
                if(userNumber < min) {
                    min = userNumber;
                }
                if(userNumber > max) {
                    max = userNumber;
                }
            } catch(NumberFormatException e) {
                System.out.println("--EXIT REQUESTED--");
                break;
            }
        }
        if(min == Double.MAX_VALUE || max == Double.MIN_VALUE) {
            System.out.println("No valid data entered.");
        } else {
            System.out.println("Minimum was: " + min);
            System.out.println("Maximum was: " + max);
        }
    }
}
