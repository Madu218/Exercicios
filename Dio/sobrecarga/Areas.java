package sobrecarga;

public class Areas {
    
    public static double area(double lado) {
        return lado*lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1*lado2;
    }

    public static double area(double base1, double base2, double h) {
        return ((base1+base2)*h)/2;
    }

    public static float area(float lado1, float lado2) {
        return (lado1*lado2)/2;
    }
}
