public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-30));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(3625));
        System.out.println(getDurationString(3843));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-30, 45));
        System.out.println(getDurationString(65, -30));
        System.out.println(getDurationString(65, 89));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        } else {
            return "Seconds value should be greater than or equal to zero";
        }

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            return "" + minutes / 60 + "h " + minutes % 60 + "m " + seconds + "s";
        } else {
            return "Seconds and minutes value should be greater than or equal to zero; minutes value should also be less than or equal to 59";
        }
    }
}
