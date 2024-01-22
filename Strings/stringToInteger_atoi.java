public class stringToInteger_atoi {
    public static int modifyDigit(String str){
        int j = 0;
        String res = str;
        System.out.println(str);
        while(str.charAt(j)=='0' || str.charAt(j)=='-' || str.charAt(j)=='+'){
            res = str.substring(1,str.length());
            j++;
        }
        System.out.println(res);
        return Integer.valueOf(res);
    }
    public static int myAtoi(String s) {
        String str[] = s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i]!="" && !(str[i].charAt(0)>='A' && str[i].charAt(0)<='z')){
                System.out.println(str[i]);
                return modifyDigit(str[i]);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
}
