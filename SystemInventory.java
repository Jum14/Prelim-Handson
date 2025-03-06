import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> itemPrices = new ArrayList<>();
        HashMap<String, Integer> itemQuantities = new HashMap<>();
        
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Set Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter item quantity: ");
                int quantity = scanner.nextInt();
                
                itemNames.add(name);
                itemPrices.add(price);
                itemQuantities.put(name, quantity);
                
                System.out.println(name + " added.");
            } else if (choice == 2) {
                System.out.print("Enter item name to set quantity: ");
                String name = scanner.nextLine();
                
                if (itemQuantities.containsKey(name)) {
                    System.out.print("Enter new quantity: ");
                    int quantity = scanner.nextInt();
                    itemQuantities.put(name, quantity);
                    System.out.println("Quantity of " + name + " set to " + quantity + ".");
                } else {
                    System.out.println("Item not found.");
                }
            } else if (choice == 3) {
                System.out.println("\nInventory:");
                System.out.println("Item Price   Quantity");
                System.out.println("-----------------------");
                
                for (int i = 0; i < itemNames.size(); i++) {
                    String name = itemNames.get(i);
                    double price = itemPrices.get(i);
                    int quantity = itemQuantities.get(name);
                    
                    System.out.printf("%-12s%-8.2f%d%n", name, price, quantity);
                }
            } else if (choice == 4) {
                System.out.println("Exiting the Inventory Management System.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        
        scanner.close();
    }
}