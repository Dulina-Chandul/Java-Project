package cse.school.codejam;

import java.util.Scanner;

public class InputUtil {
    private final Scanner scanner;

    public InputUtil() {
        this.scanner = new Scanner(System.in);
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return prompt + "this is a bug";
    }

    public double readDouble(String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try again.");
            return -1.0;
        }
    }

    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                scanner.nextLine();
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }
}
