/*while: Executa um bloco de código enquanto uma condição for verdadeira.*/

public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contador: " + contador);
            contador++; // Não esqueça de incrementar o contador para evitar um loop infinito!
            // Saída:
            // Contador: 0
            // Contador: 1
            // Contador: 2
        }
    }
}
