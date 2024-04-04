package console_application_practice.TruckingDispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Good {
    private String name;
    private int weight;
    private int quantity;

    public Good(String name, int weight, int quantity) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalWeight() {
        return weight * quantity;
    }
}

class Truck {
    private static final int MAX_WEIGHT = 500;

    private Map<String, List<Good>> goodsOnTruck;

    public Truck() {
        goodsOnTruck = new HashMap<>();
    }

    public boolean canAddGood(Good good) {
        return (getTotalWeight() + good.getTotalWeight() <= MAX_WEIGHT) && (goodsOnTruck.size() < 3);
    }

    public void addGood(Good good) {
        if (canAddGood(good)) {
            if (!goodsOnTruck.containsKey(good.getName())) {
                goodsOnTruck.put(good.getName(), new ArrayList<>());
            }
            goodsOnTruck.get(good.getName()).add(good);
            System.out.println(good.getQuantity() + " " + good.getName() + "(s) added. Current weight: " + getTotalWeight() +
                    " kg. Remaining capacity: " + (MAX_WEIGHT - getTotalWeight()) + " kg.");
        } else {
            System.out.println(good.getName() + " cannot be added.");
        }
    }

    public void removeGood(String name) {
        if (goodsOnTruck.containsKey(name)) {
            List<Good> goods = goodsOnTruck.get(name);
            if (!goods.isEmpty()) {
                Good removedGood = goods.remove(goods.size() - 1);
                System.out.println(removedGood.getName() + " removed. Current weight: " + getTotalWeight() +
                        " kg. Remaining capacity: " + (MAX_WEIGHT - getTotalWeight()) + " kg.");
            } else {
                System.out.println("No " + name + " found on the truck.");
            }
        } else {
            System.out.println(name + " not found on the truck.");
        }
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (List<Good> goods : goodsOnTruck.values()) {
            for (Good good : goods) {
                totalWeight += good.getTotalWeight();
            }
        }
        return totalWeight;
    }

    public void displayGoodsOnTruck() {
        System.out.println("Goods on the truck:");
        for (Map.Entry<String, List<Good>> entry : goodsOnTruck.entrySet()) {
            String name = entry.getKey();
            List<Good> goods = entry.getValue();
            for (Good good : goods) {
                System.out.println(good.getName() + ": " + good.getQuantity() + " x " + good.getWeight() + " kg = " +
                        good.getTotalWeight() + " kg");
            }
        }
    }

    public void displayTruckWeight() {
        System.out.println("Total weight of the truck: " + getTotalWeight() + " kg");
    }
}

public class TruckDispatchSystem1 {
    public static void main(String[] args) {
        Truck truck = new Truck();
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
                    String name = scanner.nextLine();
                    System.out.print("Enter the weight of the good (in kg): ");
                    int weight = scanner.nextInt();
                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();

                    Good good = new Good(name, weight, quantity);
                    truck.addGood(good);

                    break;
                case 2:
                    System.out.print("Enter the name of the good to remove: ");
                    String goodToRemove = scanner.nextLine();
                    truck.removeGood(goodToRemove);
                    break;
                case 3:
                    truck.displayGoodsOnTruck();
                    break;
                case 4:
                    truck.displayTruckWeight();
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
