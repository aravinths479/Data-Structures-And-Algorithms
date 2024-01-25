package BYTS.accesSpecifiers;

public class Test {
    private Integer a = 10;

    public Integer getA(){
        return this.a;
    }

    private void test(){
        System.out.println("Test called "+a);
    }

    public void test1(){
        test();
    }
}
