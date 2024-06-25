

public class Invoice {

    private String crust;
    private String filling;
    private String toppings;

    private int crustPrice;
    private int fillingPrice;
    private int toppingsPrice;

    public String getCrust() {
        return crust;
    }

    public String getFilling() {
        return filling;
    }

    public String getToppings() {
        return toppings;
    }

    public int getCrustPrice() {
        return crustPrice;
    }

    public int getFillingPrice() {
        return fillingPrice;
    }

    public int getToppingsPrice() {
        return toppingsPrice;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setCrustPrice(int crustPrice) {
        this.crustPrice = crustPrice;
    }

    public void setFillingPrice(int fillingPrice) {
        this.fillingPrice = fillingPrice;
    }

    public void setToppingsPrice(int toppingsPrice) {
        this.toppingsPrice = toppingsPrice;
    }

    @Override
    public String toString() {
        return "Invoice [crust=" + crust + ", filling=" + filling + ", toppings=" + toppings + ", crustPrice="
                + crustPrice + ", fillingPrice=" + fillingPrice + ", toppingsPrice=" + toppingsPrice + "]";
    }

}