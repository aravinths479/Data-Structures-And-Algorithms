package console_application_practice.TruckingDispatch;

import java.util.*;

class Good {

    private String name;
    private int kg;
    private int quantity;

    public Good(String name, int kg, int quantity) {
        this.name = name;
        this.kg = kg;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int kg() {
        return kg;
    }

    public int quantity() {
        return quantity;
    }

    public int GetTotalWeight() {
        return kg * quantity;
    }
}

class Truck {
    private static final int MAX_WEIGHT = 500;
    private Map<String, List<Good>> truck;

    public Truck() {
        truck = new HashMap<>();
    }

    private int  totalWeight(){
        int total = 0;
        for(List<Good> goods:truck.values()){
            for(Good g:goods){
                total += g.GetTotalWeight();
            }
        }
        return total;
    }

    public boolean canAddGood(Good good) {
        return (totalWeight() + good.GetTotalWeight() <= MAX_WEIGHT) && (truck.size() < 3);
    }

    public void addGood(Good good){
        if(canAddGood(good)){
            if(!truck.containsKey(good.getName())){
                truck.put(good.getName(),new ArrayList<>());
            }
            truck.get(good.getName()).add(good);
            System.out.println("Goods added sucessfully");
        }
        else{
            System.out.println("cannot be added");
        }
    }
    //public void remove(String name)
}

public class dipatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Truck truck = new Truck();
        System.out.println("---- Dispatch ----");
        do{
            System.out.println("1.Add Goods  \n 2. remove Goods \n 3.Truck Details \n 4. Goods Details");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                {
                    System.out.println("Enter the name of the Good : ");
                    String name = sc.next();
                    System.out.println("Wnter the weight in kg : ");
                    int kg = sc.nextInt();
                    System.out.println("Enter the quantity : ");
                    int quantity = sc.nextInt();
                    Good good = new Good(name,kg,quantity);
                    truck.addGood(good);
                }    
            }
        }while(true);
    }
}
