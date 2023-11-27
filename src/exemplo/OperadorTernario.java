package exemplo;

public class OperadorTernario {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int min = (a<b)?a:b;

        System.out.println(min);

        int c = 10;
        int d = 5;
        int min2 = (a<b)?c:d;
        System.out.println(min2);
    }
}
