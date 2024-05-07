/**
 * test1
 */
public class test1 {

    public static void main(String[] args) {
        String str = "a1b2c10";
        String nums = "";
        char letter = ' ';
        char last = ' ';
        for(char i:str.toCharArray()){
            if(!(i>='0' && i<='9')){
                if(nums!=""){
                    for(int j=0;j<Integer.parseInt(nums);j++){
                        System.out.print(letter);
                    }
                }
                letter = i;
                nums = "";
            }
            else{
                nums+=i;
            }
        }
        for(int j=0;j<Integer.parseInt(nums);j++){
            System.out.print(letter);
        }
    }
}