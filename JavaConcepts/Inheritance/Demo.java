class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n1;
    }
}

class Advanced extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class InnerDemo {
    public double pow(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Demo {
    public static void main(String[] args) {
        Advanced obj = new Advanced();
        System.out.println(obj.add(10, 5));
    }
}