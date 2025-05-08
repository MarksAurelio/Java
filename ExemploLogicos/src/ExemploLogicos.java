/*Lógicos: && (AND lógico - verdadeiro se ambas as condições forem verdadeiras), 
|| (OR lógico - verdadeiro se pelo menos uma das condições for verdadeira), 
! (NOT lógico - inverte o valor da condição). */

public class ExemploLogicos {
    public static void main(String[] args) {
        int idade = 25;
        boolean possuiCarteira = true;
        boolean podeDirigir = idade >= 18 && possuiCarteira;
        System.out.println("Pode dirigir? " + podeDirigir); // Saída: Pode dirigir? true

        boolean estaSol = false;
        boolean estaCalor = true;
        boolean bomTempo = estaSol || estaCalor;
        System.out.println("Bom tempo? " + bomTempo); // Saída: Bom tempo? true

        boolean usuarioLogado = false;
        System.out.println("Usuário não logado? " + !usuarioLogado); // Saída: Usuário não logado? true
    }
}
