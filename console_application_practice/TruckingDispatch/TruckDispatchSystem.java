package console_application_practice.TruckingDispatch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TruckDispatchSystem {
    private static final int MAX_WEIGHT = 500;
    private Map<String, Integer> goodsOnTruck;
    private Map<String, Integer> quantityMap;

    public TruckDispatchSystem() {
        goodsOnTruck = new HashMap<>();
        quantityMap = new HashMap<>();
    }

    public void addGood(String good, int weight, int quantity) {
        int totalWeightToAdd = weight * quantity;
        if (getTotalWeight() + totalWeightToAdd <= MAX_WEIGHT && goodsOnTruck.size() < 3) {
            goodsOnTruck.put(good, totalWeightToAdd);
            quantityMap.put(good, quantity);
            System.out.println(quantity + " " + good + "(s) added. Current weight: " + getTotalWeight() +
                    " kg. Remaining capacity: " + (MAX_WEIGHT - getTotalWeight()) + " kg.");
        } else {
            System.out.println(good + " cannot be added.");
        }
    }

    public void removeGood(String good) {
        if (goodsOnTruck.containsKey(good)) {
            goodsOnTruck.remove(good);
            quantityMap.remove(good);
            System.out.println(good + " removed. Current weight: " + getTotalWeight() +
                    " kg. Remaining capacity: " + (MAX_WEIGHT - getTotalWeight()) + " kg.");
        } else {
            System.out.println(good + " not found on the truck.");
        }
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (int weight : goodsOnTruck.values()) {
            totalWeight += weight;
        }
        return totalWeight;
    }

    public void displayGoodsOnTruck() {
        System.out.println("Goods on the truck:");
        for (Map.Entry<String, Integer> entry : goodsOnTruck.entrySet()) {
            String good = entry.getKey();
            int weight = entry.getValue();
            int quantity = quantityMap.get(good);
            System.out.println(good + ": " + quantity + " x " + weight / quantity + " kg = " + weight + " kg");
        }
    }

    public void displayTruckWeight() {
        System.out.println("Total weight of the truck: " + getTotalWeight() + " kg");
    }

    public static void main(String[] args) {
        TruckDispatchSystem dispatchSystem = new TruckDispatchSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add a good\n2. Remove a good\n3. Display goods on the truck\n4. Display truck weight\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the good: ");
                    String good = scanner.nextLine();
                    System.out.print("Enter the weight of the good (in kg): ");
                    int weight = scanner.nextInt();
                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();
                    
                    dispatchSystem.addGood(good, weight, quantity);
                    break;
                case 2:
                    System.out.print("Enter the name of the good to remove: ");
                    String goodToRemove = scanner.nextLine();
                    dispatchSystem.removeGood(goodToRemove);
                    break;
                case 3:
                    dispatchSystem.displayGoodsOnTruck();
                    break;
                case 4:
                    dispatchSystem.displayTruckWeight();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
