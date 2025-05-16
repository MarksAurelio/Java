import java.util.Scanner;

public class Programa{
    public static void main(String [] args) {
        System.out.println("Informe um valor: ");
        int valor = new Scanner(System.in).nextInt();
        valor += 10;
        System.out.printf("O resultado da soma de 10 é: %d \n", valor);
    }
}
