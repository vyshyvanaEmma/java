package provaJavaTipsit;

import java.util.Scanner;

public class Main{

    //Threading = allows a program to run multiple tasks simultaneously
    //Helps improve perfomance with time-consuming operations
    // File I/O, network communication, or any background tasks

    //1. Extend the Thread class
    //2. Implement the Runnable interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 sec to enteryour name:");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);

        scanner.close();
    }
}