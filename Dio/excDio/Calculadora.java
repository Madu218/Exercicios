package excDio;

public class Calculadora {

    public static void soma(double x, double y) {

        double result = x + y; 

        System.out.println("A soma de " + x + " mais " + y + " é igual a " + result);
    }


    public static void subtracao(double x, double y) {

        double result = x - y;

        System.out.println("A subtração de " + y + " em " + x + " resulta em " + result);
    }

    public static void multiplicacao(double x, double y) {

        double result = x * y;

        System.out.println("A multiplicação entre " + x + " e " + y + " resulta em " + result);
    }

    public static void divisao(double x, double y) {

        double result = x/y;

        System.out.println("A divisão de " + x + " por " + y + " resulta em " + result);
    }

}