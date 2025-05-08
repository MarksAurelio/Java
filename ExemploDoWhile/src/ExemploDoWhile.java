/*do-while: Similar ao while, mas garante que o bloco de código seja executado 
pelo menos uma vez, mesmo que a condição seja inicialmente falsa. */

 public class ExemploDoWhile {
    public static void main(String[] args) {
        int numero = 10;
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero < 5); // A condição é falsa desde o início, mas o bloco executou uma vez.
        // Saída: Número: 10
    }
}
