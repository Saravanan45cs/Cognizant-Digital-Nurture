package com.example.inventory;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Method to update a product
    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Method to display all products
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
