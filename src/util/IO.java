package util;

import java.util.Scanner;

public class IO {
    public static void info(String label) {
        System.out.println(label);
    }
    public static void error(String label) {
        System.err.println(label);
    }

    /* INPUT */
    private static Scanner scanner;
    static {
        scanner = new Scanner(System.in);
    }
    public static Integer getInteger(String label) {
        System.out.print(label);
        return Integer.parseInt(scanner.nextLine());
    }
    public static Double getDecimal(String label) {
        System.out.print(label);
        return Double.parseDouble(scanner.nextLine());
    }
}
