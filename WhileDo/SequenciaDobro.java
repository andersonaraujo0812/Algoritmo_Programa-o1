/*
Construir um algoritmo que leia um número inteiro e imprime a 	sequência:
– 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .
– enquanto o valor da sequência for menor ou igual ao número lido.

*/

package WhileDo;

import java.util.Scanner;

public class SequenciaDobro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Algoritmo para imprimir uma sequência numérica até o valor digitado.\nDigite o número desejado: \n");
        int a = entrada.nextInt(),b=1;
        System.out.println();
        
        do {
            System.out.println(+b);
            b *= 2;
        } while (b<=a);

        entrada.close();
    }
}
