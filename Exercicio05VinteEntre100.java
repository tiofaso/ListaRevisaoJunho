import java.util.ArrayList;
import java.util.Scanner;

//Programa lê 20 números e verifica quantos estão entre 0 e 100
public class Exercicio05VinteEntre100 {
    public static void main(String[] args){
        //Declarando variáveis
        ArrayList<Integer> numDigitados = new ArrayList<Integer>();

        System.out.println("Digite 20 números inteiros e eu vou descobrir quanto estão entre 0-100\n");
        //Iniciando leitura das idades
        Scanner entrada = new Scanner(System.in);
        int numIntervalo0a100 = 0;

        //Colhendo os 20 núemros
        for(int i = 0; i < 20; i++){
            System.out.println("Digite o " + (i+1) +  "° número:");
            numDigitados.add(entrada.nextInt());

            if(numDigitados.get(i) >= 0 && numDigitados.get(i) <= 100){
                numIntervalo0a100 = numIntervalo0a100 + 1;
            }
        }

        //Exibindo os resultados
        System.out.println("Você ditigou os seguinte números: " + numDigitados);
        System.out.println("Deles apenas " + numIntervalo0a100 + " estão entre o intervalo de 0 a 100.");
    }
}
