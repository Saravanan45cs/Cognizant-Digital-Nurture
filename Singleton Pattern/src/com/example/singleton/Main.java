package com.example.singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using the logger instance
        logger1.log("First log message");
        logger2.log("Second log message");

        // Verify that both logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}
