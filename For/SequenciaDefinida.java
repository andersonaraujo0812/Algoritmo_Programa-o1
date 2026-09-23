/*
Ler um número inteiro e imprimir na tela a sequência de 	
números que vai do número 1 até o número lido.
– Exemplo:
¨ Digite um número:
¨ 8
¨ Sequência: 1 2 3 4 5 6 7 8.

*/

package For;

import java.util.Scanner;

public class SequenciaDefinida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Algoritmo para imprimir a sequencia dos números até o que foi informado.");
        System.out.println("Digite um número: ");
        int a = entrada.nextInt();

        
        System.out.print("Sequencia: ");
        for(int b =1;b<=a;b++){
            System.out.print(b+" ");
        }


        entrada.close();
    }
}
