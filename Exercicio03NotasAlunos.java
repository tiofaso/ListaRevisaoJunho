import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//Programa adiciona um aluno e suas notas, calculando sua média
//e sua média de aproveitamento
public class Exercicio03NotasAlunos {
    public static void main(String[] args){
        //Colhendo dados
        System.out.println("Digite o número de identificação do aluno");
        Scanner entrada = new Scanner(System.in);

        int alunoId = entrada.nextInt(); //ID do aluno

        //Notas do aluno
        double alunoNota01 = 0;
        double alunoNota02 = 0;
        double alunoNota03 = 0;

        System.out.println("Agora digite a 1ª nota do aluno:");
        alunoNota01 = entrada.nextDouble();


        System.out.println("Agora digite a 2ª nota do aluno:");
        alunoNota02 = entrada.nextDouble();

        System.out.println("Agora digite a 3ª nota do aluno:");
        alunoNota03 = entrada.nextDouble();

        //Calculando média do aluno
        double alunoMedia = (alunoNota01 + alunoNota02 + alunoNota03)/3;

        //Calculando média de aproveitamento
        double alunoMediaAproveitamento = (((alunoNota01 + (alunoNota02 * 2) + (alunoNota03 * 3))) + alunoMedia)/7;

        //Exibindo resultados
        //Convertendo para formato decima com 2 casas
        DecimalFormat formatador = new DecimalFormat("0.0");

        System.out.println("O resultados do aluno nº" + alunoId + " são o seguinte:");
        System.out.println("1ª nota: " + formatador.format(alunoNota01));
        System.out.println("2ª nota: " + formatador.format(alunoNota02));
        System.out.println("3ª nota: " + formatador.format(alunoNota03));
        System.out.println("Média das notas: " + formatador.format(alunoMedia));
        System.out.println("Média de aproveitamento: " + formatador.format(alunoMediaAproveitamento));

        if(alunoMediaAproveitamento * 10 >= 90 ){System.out.println("Conceito final: A");}
        else if(alunoMediaAproveitamento * 10 >= 75 && alunoMediaAproveitamento * 10 < 90){System.out.println("Conceito final: B");}
        else if(alunoMediaAproveitamento * 10 >= 60 && alunoMediaAproveitamento * 10 < 75){System.out.println("Conceito final: C");}
        else if(alunoMediaAproveitamento * 10 >= 40 && alunoMediaAproveitamento * 10 < 60){System.out.println("Conceito final: D");}
        else if(alunoMediaAproveitamento * 10  < 40){System.out.println("Conceito final: E");}
    }
}
