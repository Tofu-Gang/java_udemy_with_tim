import java.util.InputMismatchException;
import java.util.Scanner;

public class ParsingValuesAndReadingInput {
    static int MAX_AGE = 125;
    static int CURRENT_YEAR = 2023;

    public static void main(String[] args) {
        try {
            // console does not work in IDEA; must be run manually from the terminal
            System.out.println(getInputFromConsole());
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner());
        }
    }

    public static String getInputFromConsole() {
        String name = System.console().readLine("Hi, What's Your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = CURRENT_YEAR - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi, What's Your Name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");
        System.out.print("What year were you born? ");

        int dateOfBirth = -1;
        do {
            System.out.println("Enter a year of birth >= " + (CURRENT_YEAR - MAX_AGE) + " and <= " + CURRENT_YEAR);
            try {
                dateOfBirth = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Characters not allowed!!! Try again.");
            }
            sc.nextLine();
        } while(!isDateOfBirthValid(dateOfBirth));

        int age = CURRENT_YEAR - dateOfBirth;
        return "So you are " + age + " years old";
    }

    public static boolean isDateOfBirthValid(int dateOfBirth) {
        int minimumYear = CURRENT_YEAR - MAX_AGE;
        return dateOfBirth >= minimumYear && dateOfBirth <= CURRENT_YEAR;
    }
}
