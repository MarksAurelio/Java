/*if-else if-else: Permite verificar múltiplas condições em sequência. */

public class ExemploIfElseIfElse {
    public static void main(String[] args) {
        int media = 60;
        if (media >= 70) {
            System.out.println("Aprovado!");
        } else if (media >= 50) {
            System.out.println("Recuperação."); // Saída: Recuperação.
        } else {
            System.out.println("Reprovado.");
        }
    }
}
