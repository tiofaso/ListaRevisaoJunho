import java.util.ArrayList;
import java.util.Scanner;

//Programa lê a idade de 20 pessoas e calcula a sua média
public class Exercicio04Media20Idades {
    public static void main(String[] args){
        //Declarando variáveis
        ArrayList<Integer> pessoasIdade = new ArrayList<Integer>();
        int pessoasIdadeSoma = 0;

        System.out.println("Vamos calcular a média de idade de 20 pessoas?\n");
        //Iniciando leitura das idades
        Scanner entrada = new Scanner(System.in);

        //Colhendo as idades e somando
        for(int i = 0; i < 20; i++){
            System.out.println("Digite a idade da " + (i+1) +  "ª pessoa:");
            pessoasIdade.add(entrada.nextInt());
            pessoasIdadeSoma = pessoasIdadeSoma + pessoasIdade.get(i);
        }

        //Exibindo os resultados
        String pessoasTabela = "| %-3s  | %-3S |%n";

        System.out.format("+-------------------+%n");
        System.out.format("| pessoa n° | idade |%n");
        System.out.format("+-------------------+%n");

        for(int j = 0; j < 20; j++){
            System.out.format(pessoasTabela,"pessoa n°" + j,pessoasIdade.get(j));
        }
        System.out.format("+-------------------+%n");
        System.out.println("A média das idades das 20 pessoas é de " + (pessoasIdadeSoma/20));
    }
}
