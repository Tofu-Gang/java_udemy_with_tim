public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        int feet = 5;
        int inches = 8;
        System.out.println("" + feet + "ft, " + inches + "in = " + convertToCentimeters(feet, inches) + "cm");
        inches = 68;
        System.out.println("" + inches + "in = " + convertToCentimeters(inches) + "cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }
}
