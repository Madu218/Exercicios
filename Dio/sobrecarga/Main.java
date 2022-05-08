package sobrecarga;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Exercício de sobreccarga:");

        double areaQuadrado = Areas.area(4);
        System.out.println("A área do quadrado é igual a " + areaQuadrado);

        double areaRetangulo = Areas.area(3d, 6d);
        System.out.println("A área do retângulo é igual a " + areaRetangulo);

        double areaTrapezio = Areas.area(4, 7, 5);
        System.out.println("A área do trapézio é igual a " + areaTrapezio);

        System.out.println("A área do triângulo é igual a " + Areas.area(3, 4));
    }
}
