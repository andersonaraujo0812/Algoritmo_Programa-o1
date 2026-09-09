/*
Anderson de Araújo Júnior
Faça um algoritmo que receba um número, calcule e mostre:
O número elevado ao quadrado;
O número elevado ao cubo;
A raiz quadrada do número digitado;
O número elevado a potência 10;
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número para os cálculos: ");
        double num = entrada.nextDouble();

        System.out.println("O número elevado ao quadrado: "+Math.pow(num, 2));
        System.out.println("O número elevado ao cubo: "+Math.pow(num, 3));
        System.out.println("A raiz quadrada do número digitado: "+Math.sqrt(num));
        System.out.println("O número elevado a potência 10: "+Math.pow(num, 10.0));
        
        entrada.close();
    }
}
