//1 –Criar  o método encontrarMax()que retorne o maior valorentre dois números lidos no main().
// •O método deve  receber dois parâmetros  do tipo int.

public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num2 = 20;
        int max = encontrarMax(num1, num2);
        System.out.println("O maior valor é: " + max);
    }

    static int encontrarMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}