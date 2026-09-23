/*
Faça um algoritmo que leia dez números inteiros e positivos
– mostre o menor entre eles.

*/

package WhileDo;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Algoritmo para ler 10 números inteiros e mostar o menor entre eles");
        int a = 1,b,c = Integer.MAX_VALUE;
        do {
            System.out.println("Digite o "+a+" número");
            b = entrada.nextInt();
            a++;

            while (b<=0) {
                System.out.println("Número inválido, digite apenas número inteiros e maiores que 0");
                b = entrada.nextInt();

            }
            if (c>b) {
                c = b;
                
            }

        } while (a<=10);
        System.out.println("O menor número digitado foi: "+c);

        entrada.close();
        
    }
}
