package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter membership status (Regular, VIP, Premium): ");
        String status = scanner.nextLine().trim();

        System.out.printf("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        double price = 0.00;

        if (status.equalsIgnoreCase("Regular")) {
            if (age < 18) {
                price = 50.00;
            } else if (age <= 64) {
                price = 100.00;
            } else {
                price = 75.00;
            }
        } else if (status.equalsIgnoreCase("VIP")) {
            if (age < 18) {
                price = 75.00;
            } else if (age <= 64) {
                price = 150.00;
            } else {
                price = 112.50;
            }
        } else if (status.equalsIgnoreCase("Premium")) {
            if (age < 18) {
                price = 100.00;
            } else if (age <= 64) {
                price = 200.00;
            } else {
                price = 150.00;
            }
        } else {
            System.out.println("Invalid membership status entered.");
            scanner.close();
            return;
        }


        System.out.printf("Price: $%.2f%n", price);

        scanner.close();
    }
}