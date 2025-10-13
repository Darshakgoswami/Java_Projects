package DSA;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String name;
    int quantity;
    double price;

    public Product(int productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Add New Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product by Name");
            System.out.println("4. Update Quantity by Product ID");
            System.out.println("5. Calculate Total Inventory Value");
            System.out.println("6. Delete Product by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    inventory.add(new Product(id, name, quantity, price));
                    break;

                case 2:
                    System.out.println("All Products:");
                    for (Product p : inventory) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Enter Product Name to Search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Product p : inventory) {
                        if (p.name.equalsIgnoreCase(searchName)) {
                            System.out.println(p);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update Quantity: ");
                    int pid = sc.nextInt();
                    found = false;
                    for (Product p : inventory) {
                        if (p.productId == pid) {
                            System.out.print("Enter New Quantity: ");
                            p.quantity = sc.nextInt();
                            System.out.println("Quantity updated.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    double totalValue = 0;
                    for (Product p : inventory) {
                        totalValue += p.price * p.quantity;
                    }
                    System.out.println("Total Inventory Value: " + totalValue);
                    break;

                case 6:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();
                    Product toRemove = null;
                    for (Product p : inventory) {
                        if (p.productId == deleteId) {
                            toRemove = p;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        inventory.remove(toRemove);
                        System.out.println("Product deleted.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting Program.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}