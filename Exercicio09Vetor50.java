//Programa cria um vetor com 50 posições e adiciona 50 números a partir do 101
public class Exercicio09Vetor50 {
    public static void main (String[] args){
        //Criando o vetor
        int[] lista50 = new int[50];
        int numPreenchimento = 101;

        //povoando o vetor
        for(int i = 0; i < 50; i++){
            lista50[i] = numPreenchimento;
            numPreenchimento = numPreenchimento + 1;
        }

        //Exibindo os resultados
        String pessoasTabela = "| %-2s |   %-3s   |%n";

        System.out.format("+--------------+%n");
        System.out.format("| n° |  número |%n");
        System.out.format("+--------------+%n");

        for(int j = 0; j < 50; j++){
            System.out.format(pessoasTabela,j,lista50[j]);
        }
        System.out.format("+--------------+%n");

    }
}
