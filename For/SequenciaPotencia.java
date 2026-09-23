/*
Faça um algoritmo que apresente na tela os quadrados dos 	
números inteiros de 15 a 100.
Exemplo:
O quadrado de 15 é 225
O quadrado de 16 é 256
. . .
O quadrado de 100 é 10000

*/

package For;

public class SequenciaPotencia {
    public static void main(String[] args) {
        int a;

        System.out.println("Algoritmo para mostrar os quadrados dos números entre 15 e 100\n");

        for (a = 15;a<=100;a++){
            System.out.println("O quadrado de "+a+" é: "+Math.pow(a, 2));

        }
        
    }
}
