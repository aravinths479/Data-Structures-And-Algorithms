package simple_programs;

public class twelvehrsTo24HrsFormat {
    public static void main(String[] args) {
        String str = "06:12:45 AM";
        
        int hrs = Integer.parseInt(str.substring(0, 2));
        
        String meridian = str.substring(9);
        
        if(meridian.equals("PM")){
            int newhrs = hrs+12;
            String newFormat ="" + (newhrs) + str.substring(2);
            System.out.println(newFormat);
        }
        else{
            System.out.println(str);
        }   
    }
}
