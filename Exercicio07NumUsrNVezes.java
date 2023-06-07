import java.util.ArrayList;
import java.util.Scanner;

//Programa lê um número de usuário, um valor N aleatório e repete o número N vezes na tela
public class Exercicio07NumUsrNVezes {
    public static void main(String[] args) {
        //Declarando variáveis
        int numUsr = 0;
        int numN = 0;

        //Iniciando leitura das idades
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de  usuário com 4 dígitos como 1246");
        numUsr = entrada.nextInt();

        System.out.println("Agora me fale um número inteiro positivo e aleatório");
        numN = entrada.nextInt();

        int numPositoOk = 1; //Verifica se o usuário digitou um número positivo

        do {
            if (numN < 0) {//Usuário digitou número negativo
                System.out.println("O número tem que ser positivo!");
                numN = entrada.nextInt();
                numPositoOk = 0;
            } else {
                numPositoOk = 1;
            }
        } while (numPositoOk == 0);

        //Imprimindo a repetição
        System.out.print("Você digitou " + numN + "então...\n");
        for (int i = 0; i < numN; i++) {
            System.out.println((i + 1) + " " + numUsr + "");
        }

        System.out.println("... imprimi o número " + numUsr + " " + numN + " vezes! :D");
    }
}
