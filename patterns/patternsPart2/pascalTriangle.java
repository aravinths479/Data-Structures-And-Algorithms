package patterns.patternsPart2;

public class pascalTriangle {
    public static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<=n;i++){
            for(int spc= 0;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                int num = fact(i)/((fact(i-j))*fact(j));
                System.out.print(num+" ");
            }
            System.out.println();
        }
        
    }
}
