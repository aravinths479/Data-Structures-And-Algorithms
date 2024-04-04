package mrcooper.insurence;

import java.util.ArrayList;

public class User {
  static int id = 0;
  private int custid = 0;;
  private String name;
  private int phone;
  private ArrayList<Integer> policy; // for collting the ID of the policy ID

  public User(String a, int b) {
    this.custid = id++;
    this.name = a;
    this.phone = b;
    this.policy = new ArrayList<Integer>();
  }

  public ArrayList<Integer> getpo() {
    return policy;
  }

  public int getid() {
    return id;
  }

  public String getname() {
    return this.name;
  }

  public int getphone(int id) {
    return this.phone;
  }

}