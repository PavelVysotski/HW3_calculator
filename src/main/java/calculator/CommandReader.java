package calculator;

import java.util.Scanner;

public class CommandReader {
    private static final Scanner scan = new Scanner(System.in);

    public static double readNumber(String message) {
        System.out.print(message);
        return Double.parseDouble(scan.nextLine());
    }

    public static int readChoice(String message) {
        System.out.print(message);
        return Integer.parseInt(scan.nextLine());
    }
}
