public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char letter = 'a';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'b';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'c';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'd';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'e';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'f';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'g';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'h';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'i';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'j';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'k';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'l';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'm';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'n';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'o';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'p';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'q';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'r';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 's';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 't';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'u';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'v';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'w';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'x';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'y';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = 'z';
        System.out.println(letter + " is in NATO " + toNATO(letter));
        letter = '6';
        System.out.println(letter + " is in NATO " + toNATO(letter));
    }

    public static String toNATO(char letter) {
        switch (letter) {
            case 'a':
                return "Able";
            case 'b':
                return "Baker";
            case 'c':
                return "Charlie";
            case 'd':
                return "Dog";
            case 'e':
                return "Easy";
            case 'f':
                return "Fox";
            case 'g':
                return "George";
            case 'h':
                return "How";
            case 'i':
                return "Item";
            case 'j':
                return "Jig";
            case 'k':
                return "King";
            case 'l':
                return "Love";
            case 'm':
                return "Mike";
            case 'n':
                return "Nan";
            case 'o':
                return "Oboe";
            case 'p':
                return "Peter";
            case 'q':
                return "Queen";
            case 'r':
                return "Roger";
            case 's':
                return "Sugar";
            case 't':
                return "Tare";
            case 'u':
                return "Uncle";
            case 'v':
                return "Victor";
            case 'w':
                return "William";
            case 'x':
                return "X-ray";
            case 'z':
                return "Yoke";
            case 'y':
                return "Zebra";
            default:
                return "not found";
        }
    }
}
