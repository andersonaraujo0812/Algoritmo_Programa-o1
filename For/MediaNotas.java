/*
Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
a) A média aritmética das duas notas de cada aluno;
b) Forneça a seguinte mensagem de acordo com a nota:
¨ REPROVADO se média é menor ou igual a 3.
¨ EXAME se média é acima de 3 e menor que 7.
¨ APROVADO maior ou igual a 7
c) O total de alunos aprovados.
d) O total de alunos de exame.
e) O total de alunos reprovados.
f) A média da classe.

*/
package For;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Algoritmo para receber a nota de 6 alunos e executar as funções definidas.");

        double nota1,nota2,media,mediaClasse=0;
        int aprovado=0,exame=0,reprovado=0;


        for(int a = 1;a<=6;a++){
        System.out.println("\nCadastro do "+a+" aluno.");
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        while (nota1<0 || nota1>10) {
            System.out.println("Nota inválida, tente novamente: ");
            nota1 = entrada.nextDouble();
            
        }
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        while (nota2<0 || nota2>10) {
            System.out.println("Nota inválida, tente novamente: ");
            nota2 = entrada.nextDouble();
            
        }
        
        media = (nota1+nota2)/2;
        mediaClasse += media;
        System.out.println("A média entre as notas é: "+media);
    
        if (media<=3) {
            System.out.println("REPROVADO - média menor ou igual a 3.");
            reprovado++;
        }else if (media>3 && media<7) {
            System.out.println("EXAME - média acima de 3 e menor que 7.");
            exame++;
        }else {

            System.out.println("APROVADO - média maior ou igual a 7.");
            aprovado++;
        }
    
    } mediaClasse = mediaClasse/6;
        System.out.println("\nTotal de alunos reprovados: "+reprovado);
        System.out.println("Total de alunos exame: "+exame);
        System.out.println("Total de alunos aprovados: "+aprovado);
        System.out.println("A média da classe é: "+mediaClasse);




        entrada.close();
    }
}
