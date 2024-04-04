package mrcooper.insurence;

import java.util.List;

public class InsurancePolicy {
    private int id;
    private String name;
    private int duration;
    private double cost;
    private int type;
    public InsurancePolicy(int id, String name, int duration, double cost,int type) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.cost = cost;
        this.type=type;
    }
    public int getId() {
        return id;
    }
    public int gettype() {
        return type;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

