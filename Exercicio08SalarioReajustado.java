import java.util.ArrayList;
import java.util.Scanner;

//Programa recebe N valores de salário e depois reajusta todos para um valor Y
public class Exercicio08SalarioReajustado {
    public static void main(String[] args){
        //Declarando variáveis
        ArrayList<Double> numSalario = new ArrayList<Double>();
        int numExit = 0;
        int numContadorUsr = 0;
        double numReajuste = 0;

        System.out.println("Quero armazenar salários diversos e depois mostrar o reajuste");
        System.out.println("Quando desejar parar digite qualquer número negativo\n");
        //Iniciando leitura das idades
        Scanner entrada = new Scanner(System.in);

        //Colhendo números de usuários
       while(numExit == 0){
            System.out.println("Digite do salário (para sair digite -1 ou outro negativo)");
            numSalario.add(entrada.nextDouble());

            if(numSalario.get(numContadorUsr) < 0){numExit = -1;}
            numContadorUsr++;

        }

        System.out.println("\nAgora digite um valor de reajuste (p.e. 12 para 12%)");
        numReajuste = entrada.nextDouble();

        //Exibindo os resultados
        String pessoasTabela = "| %-2s |   %-6s   |   %-6s   |%n";

        System.out.format("+---------------------------------+%n");
        System.out.format("| n° |  sal atual  |  sal reajust  |%n");
        System.out.format("+---------------------------------+%n");

        for(int j = 0; j < (numContadorUsr-1); j++){
            System.out.format(pessoasTabela,j,"R$" + numSalario.get(j),"R$" + (numSalario.get(j) + (numSalario.get(j)*(numReajuste/100))));
        }
        System.out.format("+----------------------------------+%n");
        System.out.println("O reajuste foi calculado com " + numReajuste + "%");
    }
}
