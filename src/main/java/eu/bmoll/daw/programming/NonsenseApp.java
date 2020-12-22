package eu.bmoll.daw.programming;

import eu.bmoll.daw.programming.helper.ConsoleUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NonsenseApp {
    private static String EXIT_KEY = "9";

    public static void main(String[] args) {
        ConsoleUtils consoleUtils = new ConsoleUtils();
        boolean isExit = false;
        while (!isExit) {
            String s = consoleUtils.getUserInput();
            System.out.println("Your intered is: " + s);
            isExit = StringUtils.equals(s, EXIT_KEY);
        }
        System.out.println("END");
    }
}
