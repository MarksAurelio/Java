/*De Comparação: == (igual a), != (diferente de), > (maior que), < (menor que), 
>= (maior ou igual a), <= (menor ou igual a). 
Retornam um valor booleano (true ou false).*/

public class ExemploComparacao {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println("x == y? " + (x == y)); // Saída: x == y? false
        System.out.println("x != y? " + (x != y)); // Saída: x != y? true
        System.out.println("x > y? " + (x > y));   // Saída: x > y? true
        System.out.println("x < y? " + (x < y));   // Saída: x < y? false
    }
}
