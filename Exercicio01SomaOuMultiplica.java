import java.util.Scanner;

//Programa que lê dois valores A e B se forem iguais, soma.
//se forem diferentes, multiplica.
public class Exercicio01SomaOuMultiplica {
    public static void main(String[] args){
        //Abrindo leitura de dados
        Scanner entrada = new Scanner(System.in);

        //Setando variáveis
        System.out.println("Digite qualquer número inteiro:");
        int numA = entrada.nextInt();

        System.out.println("Digite outro número inteiro qualquer:");
        int numB = entrada.nextInt();

        int numC = 0; //recebe o valor das contas

        //Comparando números
        if(numA == numB){
            numC = numA + numB;
            System.out.println("Como os números digitados são iguais, resolvi somá-los.");
            System.out.println("O resultado de " + numA + " + " + numB + " = " + numC );
        }else{
            numC = numA * numB;
            System.out.println("Como os números digitados são diferentes, resolvi multiplicá-los.");
            System.out.println("O resultado de " + numA + " x " + numB + " = " + numC );
        }

    }
}
