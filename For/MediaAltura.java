/*
Faça um algoritmo que receba a idade e a altura de 10 pessoas:
– calcule e mostre a média das alturas daquelas com mais de 50 anos.

*/
package For;

import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade,b=0;
        double altura, mediaAltura=0;

        System.out.println("Algoritmo para ler a idade e altura de 10 pessoas, e depois mostrar a média de altura das que possuem mais de 50 anos.");


        for(int a = 1;a<=10;a++){

        System.out.println("\nCadastro "+a+" pessoa.\n");

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();

            if (idade>50) {
            mediaAltura += altura;
            b++;

            
            }

        }
        System.out.println("A média de altura entre as pessoas com mais de 50 anos é: "+mediaAltura/b);
        entrada.close();
    }
}
