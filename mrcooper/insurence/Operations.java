package mrcooper.insurence;

import java.util.*;

public class Operations {
    public void list(InsurancePolicy p) {
        System.out.print(p.getId() + "   " + p.getName() + " " + p.getDuration() + " " + p.getCost() + "  ");
        if (p.gettype() == 0) {
            System.out.println("HEALTH");
        } else if (p.gettype() == 1) {
            System.out.println("LIFE");
        } else {
            System.out.println("Accident");
        }
    }

    public void filter(int type, InsurancePolicy p) {
        if (p.gettype() == type) {
            System.out.print(p.getId() + "   " + p.getName() + " " + p.getDuration() + " " + p.getCost() + " " + "  ");
            if (p.gettype() == 0) {
                System.out.println("HEALTH");
            } else if (p.gettype() == 1) {
                System.out.println("LIFE");
            } else {
                System.out.println("Accident");
            }
        }
    }

    public void mypolicy(User a, ArrayList<InsurancePolicy> o) {
        System.out.println("Id " + a.getid() + " name  " + a.getname());
        ArrayList<Integer> p = a.getpo();
        for (int i = 0; i < p.size(); i++) {
            int pp = p.get(i);
            for (int j = 0; j < o.size(); j++) {
                InsurancePolicy aa=o.get(j);
                if (o.get(j).getId() == pp) {
                    System.out.print(aa.getId() + "   " + aa.getName() + " " + aa.getDuration() + " " + aa.getCost()
                            + " " + "  ");
                    if (aa.gettype() == 0) {
                        System.out.println("HEALTH");
                    } else if (aa.gettype() == 1) {
                        System.out.println("LIFE");
                    } else {
                        System.out.println("Accident");
                    }
                }
            }
        }
    }
}