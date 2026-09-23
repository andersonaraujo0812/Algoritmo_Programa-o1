/*
Faça um algoritmo que leia 10 	números inteiros e diga:
quantos são pares;
e quantos são ímpares.
 */

package WhileDo;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a=1,par=0,impar=0;

        System.out.println("Algoritmo para verificar a quantidade de números pares e impares digitados.");

        do {
            System.out.println("Digite o "+a+" número:");
            int num = entrada.nextInt();
            if (num%2==0) {
                par += 1;
                System.out.println("número par");
                
            }else{
                impar += 1;
                System.out.println("número impar");
            }
            a++;
        } while (a<=10); 
        System.out.println("A quantidade de números pares digitado foi: "+par);
        System.out.println("A quantidade de números impares digitados foi: "+impar);
        entrada.close();
    }
    
}
