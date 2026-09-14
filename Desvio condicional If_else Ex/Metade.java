/*
Faça um algoritmo que leia um número inteiro.
Se o número for maior que 20. . .
calcular e imprimir a metade dele.

*/

import java.util.Scanner;

public class Metade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int a = entrada.nextInt();

        if (a>20) {
            System.out.println("A metade do número é: "+(a/2));
            
        }
        entrada.close();
        
    }
}
