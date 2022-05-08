package excDio;

public class Main {

    public static void main(String[] args) {

        //Execício da calculadora
        System.out.println("Execício calculadora:");
        Calculadora.soma(3, 4);
        Calculadora.subtracao(3, 4);
        Calculadora.multiplicacao(3, 4);
        Calculadora.divisao(3, 4);

        //execício da mensagem
        System.out.println("Exercício da mensagem:");
        Mensagem.mensagem(5);
        Mensagem.mensagem(23);
        Mensagem.mensagem(16);
        Mensagem.mensagem(27);

        //Execício do empréstimo
        System.out.println("Execício do empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.emDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.emTresParcelas());
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(50000, 3);
    }
    
}
