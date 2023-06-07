import java.util.Scanner;

//Após ler uma variável o programa identifica se é par ou impar
//Se for par ela soma 5 e se for impar soma 8
public class Exercicio02ParOuImpar {
    public static void main(String[] args){
        //Abrindo leitura de dados
        Scanner entrada = new Scanner(System.in);

        //Setando variáveis
        System.out.println("Digite qualquer número:");
        double numUsr = entrada.nextDouble();

        double numResultado = 0; //recebe o valor das contas

        //Comparando números
        if(numUsr % 2 == 0){
            numResultado = numUsr + 5;
            System.out.println("Como você digitou um número par, resolvi somá-lo com 5.0.");
            System.out.println("O resultado de " + numUsr + " + 5.0 = " + numResultado);
        }else if(numUsr % 2 != 0){
            numResultado = numUsr + 8;
            System.out.println("Como você digitou um número ímpar, resolvi somá-lo com 8.0.");
            System.out.println("O resultado de " + numUsr + " + 8.0 = " + numResultado);
        }

    }
}
