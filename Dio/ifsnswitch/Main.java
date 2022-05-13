package ifsnswitch;

public class Main {

    public static void main(String[] args) {
        numeros();
        diaSemana();
        mesesFerias();
        nomeMeses();
    }

    private static void numeros() {
        int n = 2;
        switch (n) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
            case 4:
                System.out.println("Errado");
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Valor indefinido!");
        }
    }

    private static void diaSemana() {

        String dia = "Sexta";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido!");
                break;   
        }
    }

    private static void mesesFerias() {

        String mes = "Dezembro";
        if (mes == "Janeiro" || mes == "Julho" || mes == "Dezembro") {
            System.out.println("Férias!");
        }
    }

    private static void nomeMeses() {
            
        int mes = 10;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 11) {
            System.out.println("Dezembro");
        }        
    }
}