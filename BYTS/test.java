package BYTS;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> sales = new ArrayList<>();
        sales.add(30);
        sales.add(20);
        sales.add(10);

        ArrayList<Integer> investments = new ArrayList<>();
        investments.add(30);
        investments.add(20);
        investments.add(10);
        int totalSales = 0;

        for (Integer sale : sales) {
            totalSales+=sale;
        }
        
        int totalinvestments = 0;
        for (Integer investment : investments) {
            totalinvestments+=investment;
        }

        System.out.println(totalSales + " "+totalinvestments);
    }    
}
