package eu.bmoll.daw.programming;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NonsenseApp {
    public static void main(String[] args) {
        boolean aux = StringUtils.equals("a", "A");
        System.out.println("Hello World " + aux);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string " +s);
        System.out.println("END");
    }
}
