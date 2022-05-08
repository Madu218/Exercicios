package excDio;

public class Emprestimo {
    
    public static int emDuasParcelas() {
        return 2;
    }

    public static int emTresParcelas() {
        return 3;
    }

    public static double taxaDuasParcelas() {
        return 0.3;
    }

    public static double taxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * emDuasParcelas());
            System.out.println("Valor final do empréstimo para duas parcelas: R$" + valorFinal);}

        else if (parcelas == 3) {
            double valorFinal = valor + (valor * emTresParcelas());
            System.out.println("Valor final do empréstimo para três parcelas: R$" + valorFinal);
        }

        else {
            System.out.println("Quantidade de parcelas não aceita!");
        }

    }
}
