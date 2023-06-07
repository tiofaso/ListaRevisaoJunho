import java.util.ArrayList;
import java.util.Scanner;

//Program lê números de usuário até o acontecer um número negativo
public class Exercicio06NumerosUsuario {
    public static void main(String[] args){
        //Declarando variáveis
        ArrayList<Integer> numUsr = new ArrayList<Integer>();
        int numExit = 0;
        int numContadorUsr = 0;
        int numSomaUsr = 0;

        System.out.println("Quero armazenar números de usuário com 4 dígitos como 1246");
        System.out.println("Quando desejar parar digite qualquer número negativo\n");
        //Iniciando leitura das idades
        Scanner entrada = new Scanner(System.in);

        //Colhendo números de usuários
        do{
            System.out.println("Digite os números de usuário. Exemplo: 1246");
            numUsr.add(entrada.nextInt());

            if(numUsr.get(numContadorUsr) < 0){numExit = -1;}
            else {
                numSomaUsr = numSomaUsr + numUsr.get(numContadorUsr);
                numContadorUsr++;
            }

        }while(numExit == 0);

        //Exibindo os resultados
        String pessoasTabela = "|    %-4s   |%n";

        System.out.format("+-----------+%n");
        System.out.format("| usuário n°|%n");
        System.out.format("+-----------+%n");

        for(int j = 0; j < (numContadorUsr - 1); j++){
            System.out.format(pessoasTabela,numUsr.get(j));
        }
        System.out.format("+-----------+%n");
        System.out.println("A soma dos " + (numContadorUsr - 1) + " é: " + numSomaUsr);
    }
}
