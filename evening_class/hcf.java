package evening_class;
import java.util.*;
public class hcf {
    public static void main(String[] args) {
      int n1=12;
      int n2=36;
      int hcf = 1;
      for(int i=1;i<n1;i++){
        if(n1%i==0 & n2%i==0){
          hcf=i;
        }
      }
      System.out.println(hcf);
      
    }
   
    
}
