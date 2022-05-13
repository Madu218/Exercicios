package operadores;

public class relacionais {
    
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 7;
        float f1 = 2.3f;
        float f2 = 0.4f;
        char c1 = 'm';
        char c2 = 'n';
        String s1 = "Madu";
        String s2 = "Madu";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 14435L;
        long l2 = 8769394L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 > i2 is " + (i1>i2));
        System.out.println("f2 < f1 is " + (f2<f1));
        System.out.println("c1 > c2 is " + (c1>c2));
        System.out.println("c1 != c2 is " + (c1 != c2));
        System.out.println("s1 == s2 is " + (s1==s2));
        System.out.println("b1 == b2 is " + (b1 == b2));
        System.out.println("l1 <= l2 is " + (l1<=l2));
        System.out.println("l1 <= l2 is " + (i1<=l2));
        System.out.println("y1 != h1 is " + (y1!=h1));
        System.out.println("i2 >= h1 is " + (i2>=h1));

    }
}
