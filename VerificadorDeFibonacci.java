import java.util.Scanner;

public class VerificadorDeFibonacci {
    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;
        while (true) {
            if (b == n) {
                return true;
            } else if (b > n) {
                return false;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean resultado = isFibonacci(numero);
        if (resultado) {
            System.out.println(numero + " é um número de Fibonacci.");
        } else {
            System.out.println(numero + " não é um número de Fibonacci.");
        }
        scanner.close();                                  
    }
   
}