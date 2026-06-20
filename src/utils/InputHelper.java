package utils;

import java.util.Scanner;

public class InputHelper {

    private static Scanner scanner =
            new Scanner(System.in);

    public static int getInt() {
        return scanner.nextInt();
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static String getString() {
        return scanner.nextLine();
    }
}