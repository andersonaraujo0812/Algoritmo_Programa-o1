/*
Faça um programa que:
leia duas notas de 5 alunos
Calcule e mostre a média aritmética de cada um deles;
Para cada nota lida:
A entrada de cada nota deve ser validada!
¨ ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.
¨ caso contrário, solicite-a novamente.
Utilize o do.. . while para validar as notas.
*/
package WhileDo;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Algoritmo para receber 2 notas e informar a média aritmetica entre elas");

        double nota1, nota2, media;
        int a=1;


        do{
        
        System.out.println("\nVerificação do "+a+" aluno");    
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

        System.out.println("\nA média aritmetica entre as notas é: "+media);

        a++;
       
    }while(a<=5);

    
        entrada.close();
       
    }
}
