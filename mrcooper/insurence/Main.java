package mrcooper.insurence;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Insurene APP");
        boolean loop = true;
        // objects for the Policy
        int id[] = { 1, 2, 3, 4, 5, 6 };
        String policy[] = { "P1", "P2", "P3", "P4", "P5" };
        int duration[] = { 12, 6, 24, 30, 15, 78 };
        int cost[] = { 200, 300, 500, 700, 800 };
        int type[] = { 0, 1, 2, 0, 0, 1 };
        User us = new User("Tharun", 9845);
        ArrayList<InsurancePolicy> ip = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            InsurancePolicy f = new InsurancePolicy(id[i], policy[i], duration[i], cost[i], type[i]);
            ip.add(f);
        }
        while (loop) {
            // Listing the MENU
            System.out.println("1.list policy 2.search 3.purchase 4.Your policy");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                switch (choice) {
                    case 1: {
                        Operations op = new Operations();
                        System.out.println("Policyid  PolicyName  policyDuration  PolicyCost");
                        for (int i = 0; i < 5; i++) {
                            op.list(ip.get(i));
                        }
                    }
                        break;
                    case 2: {
                        // Filtering based on type
                        System.out.println("0.Heath  1.LIfe  2.Accident 3");
                        int c = sc.nextInt();
                        if (c >= 0 && c <= 2) {
                            Operations op = new Operations();
                            for (int i = 0; i < 5; i++) {
                                op.filter(c, ip.get(i));
                            }
                        }
                    }
                        break;
                    case 3: {
                        // Purchasing Policy
                        System.out.println("Enter te policy id You need:");
                        int ch = sc.nextInt();
                        if (ch >= 1 && ch <= 6) {
                            us.getpo().add(ch);
                            System.out.println("The policy has been purchased successfully");
                        } else {
                            System.out.println("error int purchase");
                        }
                    }
                        break;
                    case 4: {
                        // Listing Policy
                        Operations op = new Operations();
                        op.mypolicy(us, ip);
                    }
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();

    }
}