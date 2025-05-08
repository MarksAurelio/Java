/*switch: Permite escolher um bloco de código para executar com base no valor 
de uma variável. */

public class ExemploSwitch {
    public static void main(String[] args) {
        int diaSemana = 3;
        String dia;
        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira"; // Saída: Hoje é Terça-feira.
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
        }
        System.out.println("Hoje é " + dia + ".");
    }
}
