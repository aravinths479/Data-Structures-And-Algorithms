import java.util.*;

public class burgerOfTheDay {
    Scanner sc = new Scanner(System.in);
    ArrayList<Invoice> Bill = new ArrayList<>();

    public void run() {

        crust crust = new crust();

        int crustChoice = (int) (Math.random() * 3) + 1;

        int total = 0;

        switch (crustChoice) {
            case 1: {
                Invoice invoice = new Invoice();
                invoice.setCrust("Hard");
                invoice.setCrustPrice(crust.hard);
                Bill.add(invoice);
                total += crust.hard;
                break;
            }
            case 2: {
                Invoice invoice = new Invoice();
                invoice.setCrust("Thin");
                invoice.setCrustPrice(crust.thin);
                Bill.add(invoice);
                total += crust.thin;
                break;
            }
            case 3: {
                Invoice invoice = new Invoice();
                invoice.setCrust("Soft");
                invoice.setCrustPrice(crust.soft);
                Bill.add(invoice);
                total += crust.soft;
                break;
            }
            default: {
                System.out.println("Invalid Opreation");
                break;
            }
        }

        //System.out.println(total);

        filling fill = new filling();

        int fillingChoice = (int) (Math.random() * 3) + 1;
        switch (fillingChoice) {
            case 1: {
                Invoice invoice = new Invoice();
                invoice.setFilling("chicken Tikka");
                invoice.setFillingPrice(fill.chickenTikka);
                Bill.add(invoice);
                total += fill.chickenTikka;
                break;
            }
            case 2: {
                Invoice invoice = new Invoice();
                invoice.setFilling("Panner Tikka");
                invoice.setFillingPrice(fill.paneerTikka);
                Bill.add(invoice);
                total += fill.paneerTikka;
                break;
            }
            case 3: {
                Invoice invoice = new Invoice();
                invoice.setFilling("Turkey meat");
                invoice.setFillingPrice(fill.TurkeyMeat);
                Bill.add(invoice);
                total += fill.TurkeyMeat;
                break;
            }
            default: {
                System.out.println("Invalid opreation");
                break;
            }
        }

       
        topings topings = new topings();

        int topingsCount = 0;
        int lastPrice = 0;

        while (topingsCount < 3) {

            int topingChoice = (int) (Math.random() * 4) + 1;

            switch (topingChoice) {
                case 1: {
                    Invoice invoice = new Invoice();
                    invoice.setToppings("Cucumber");
                    invoice.setToppingsPrice(topings.Cucumber);
                    Bill.add(invoice);
                    total += topings.Cucumber;
                    lastPrice = topings.cabbage;
                    break;
                }
                case 2: {
                    Invoice invoice = new Invoice();
                    invoice.setToppings("Tomato");
                    invoice.setToppingsPrice(topings.tomato);
                    Bill.add(invoice);
                    total += topings.tomato;
                    lastPrice = topings.cabbage;
                    break;
                }
                case 3: {
                    Invoice invoice = new Invoice();
                    invoice.setToppings("Meat Strip");
                    invoice.setToppingsPrice(topings.meatStrip);
                    Bill.add(invoice);
                    total += topings.meatStrip;
                    lastPrice = topings.cabbage;
                    break;
                }
                case 4: {
                    Invoice invoice = new Invoice();
                    invoice.setToppings("Cabbage");
                    invoice.setToppingsPrice(topings.cabbage);
                    Bill.add(invoice);
                    total += topings.cabbage;
                    lastPrice = topings.cabbage;
                    break;
                }
                case 5: {
                    topingsCount = 4;
                    break;
                }
                default: {
                    System.out.println("Innvalid opreation");
                    break;
                }
            }
            topingsCount++;
        }

        if (topingsCount == 3) {
            total = total - lastPrice;
        }

        System.out.println("---------- Invoice of the Burger ------------");

        // System.out.println(Bill);

        for (Invoice i : Bill) {
            if (i.getCrust() != null) {
                System.out.println(i.getCrust() + "   " + i.getCrustPrice());
            }
            if (i.getFilling() != null) {

                System.out.println(i.getFilling() + "  " + i.getFillingPrice());
            }
            if (i.getToppings() != null) {

                System.out.println(i.getToppings() + "  " + i.getToppingsPrice());
            }
        }

        System.out.println("Total   : " + total);
        System.out.println("------------ Thankyou for purchasing  ---------------");
        System.exit(0);

    }
}
