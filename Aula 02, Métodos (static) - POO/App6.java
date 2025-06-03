//Exercícios•4 –Criar  o método calcularFatorial()que receba como parâmetro  um número inteiro  e retorne o fatorial  calculado.

public class App {
    public static void main(String[] args) throws Exception {
        int num = 5;
        long fatorial = calcularFatorial(num);
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }

    static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

