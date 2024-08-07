package com.example.inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        inventory.addProduct(new Product("P001", "Laptop", 10, 999.99));
        inventory.addProduct(new Product("P002", "Smartphone", 20, 599.99));

        // Display inventory
        System.out.println("Inventory after adding products:");
        inventory.displayInventory();

        // Update product
        inventory.updateProduct("P001", 15, 949.99);
        System.out.println("\nInventory after updating product:");
        inventory.displayInventory();

        // Delete product
        inventory.deleteProduct("P002");
        System.out.println("\nInventory after deleting a product:");
        inventory.displayInventory();
    }
}
