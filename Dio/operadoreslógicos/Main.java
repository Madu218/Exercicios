package operadoreslógicos;

public class Main {
    
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1||b2);
        System.out.println(b3&&b4);
        System.out.println(b1&&b3);
        System.out.println(b3||b4);
        System.out.println(b1^b4);
        System.out.println(b2^b4);
        System.out.println(!b4);
        System.out.println(!b1);

        int i1 = 5;
        int i2 = 10;
        float f1 = 5f;
        double d2 = 0.6;

        System.out.println("###");
        System.out.println((i1+d2)>f1);
        System.out.println(i1 == f1);
        System.out.println((i2<d2) || (f1>d2));

        String p1 = "Paulo";
        String p2 = "Dora";

        if(p1 == "Paulo"){
            double dinheiro = 13.50;
            int picoles = 5;
            double valorUnidade = 4;
            boolean podeComprar = ((picoles)*valorUnidade) < dinheiro;
            boolean triste = !podeComprar;

            if(podeComprar && true && !triste) {
                System.out.println("Paulo comprou os picolés que ele queria e está feliz!");
            } else {
                System.out.println("Paulo está triste pois não conseguiu comprar todos os picoles que queria :(");
            }
        }

        if(p2 == "Dora"){
            double dinheiro = 23.50;
            int picoles = 5;
            double valorUnidade = 4;
            boolean podeComprar = ((picoles)*valorUnidade) < dinheiro;
            boolean triste = !podeComprar;

            if(podeComprar && true && !triste) {
                System.out.println("Dora comprou os picolés que ele queria e está feliz!");
            } else {
                System.out.println("Paulo está triste pois não conseguiu comprar todos os picoles que queria :(");
            }
        }


    }
}