package sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);

        int a = 100;
        int b = 200;
        int temp2 = a;
        a = b;
        b = temp2;
        System.out.println(a);
        System.out.println(b);
    }
}
