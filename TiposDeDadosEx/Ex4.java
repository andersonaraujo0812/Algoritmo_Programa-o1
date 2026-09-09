/*
Anderson de Araújo Júnior
Faça um algoritmo que leia quatro números inteiros.
– calcule e mostre a soma desses números.

*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o primeiro número");
        int a = entrada.nextInt();
        System.out.println("Escreva o segundo número");
        int b = entrada.nextInt();
        System.out.println("Escreva o terceiro número");
        int c = entrada.nextInt();
        System.out.println("Escreva o quarto número");
        int d = entrada.nextInt();

        System.out.println("A soma dos quatro números é: "+(a+b+c+d));


        entrada.close();
    }
}
