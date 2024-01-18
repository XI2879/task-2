package Task_2;

import java.util.Scanner;

public class Xyz {
    public static double calculateTotalAmount(Products[] products) {
        double totalAmount = 0.0;

        for (Products pr : products) {
            totalAmount += pr.getPrice() * pr.getQuantity();
        }

        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products[] product = new Products[5];

        for (int i = 0; i < 5; i++) {
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();

            product[i] = new Products(pid, price, quantity);
        }

        double maxPrice = 0.0;
        int maxPricePid = -1;

        for (Products pr : product) {
            if (pr.getPrice() > maxPrice) {
                maxPrice = pr.getPrice();
                maxPricePid = pr.getPid();
            }
        }
        System.out.println("PID of the product with the highest price: " + maxPricePid);
        double totalAmount = calculateTotalAmount(product);
        System.out.println("Total amount spent on all products: $" + totalAmount);
    }
}
