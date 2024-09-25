
//Explorando o loop while

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação sobre esse filme ou -1 para encerrar ");
            nota =  leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("A média de avaliação é: " + mediaAvaliacao / totalDeNotas);
    }
}
