
public class test {
    public static void main(String[] args) {
        String str = "a1b3c6e10";
        char letter = ' ';
        String nums = "";
        for (char ch : str.toCharArray()) {
            if(!(ch<='9' && ch>='0')){
                if(nums!=""){
                    for(int i=0;i<Integer.parseInt(nums);i++){
                        System.out.print(letter);
                    }
                }
                letter = ch;
                nums="";
            }
            else{
                nums+=ch;
            }
        }
        for(int i=0;i<Integer.parseInt(nums);i++){
            System.out.print(letter);
        }
    }
}
