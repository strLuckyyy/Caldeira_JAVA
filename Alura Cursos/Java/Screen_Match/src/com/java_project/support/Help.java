package com.java_project.support;

import java.util.Scanner;

public class Help {
    public StringBuilder split(int quantity) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < quantity; i++) {
            line.append("-");
        }
        return line;
    }

    public static String listening (String text) {
        @SuppressWarnings("resource")
        Scanner listen = new Scanner(System.in);

        System.out.println(text);
        return listen.nextLine();
    }

    public static void waitInput () {
        @SuppressWarnings("resource")
        Scanner waiting = new Scanner(System.in);
        waiting.nextLine();
    }

    public static void clearConsole () {
        System.out.print("\033\143");
    }
}
