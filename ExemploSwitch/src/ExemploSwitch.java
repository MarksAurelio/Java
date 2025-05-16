/*switch: Permite escolher um bloco de código para executar com base no valor 
de uma variável. */

public class ExemploSwitch {
    public static void main(String[] args) {
        int diaSemana = 3;
        String dia;
        dia = switch (diaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        }; // Saída: Hoje é Terça-feira
        System.out.println("Hoje é " + dia + ".");
    }
}
