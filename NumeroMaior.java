/*
Faça um algoritmo para encontrar o maior número entre 3 	números inteiros.
O algoritmo deve ler três inteiros;
se forem todos iguais, imprimir: “os números são iguais”;
caso contrário, imprimir o maior dos 3 números.

*/

import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a,b,c;

        System.out.println("Verificar 3 números diferentes e imprimir o maior");
        System.out.println("Digite o primeiro número");
        a = entrada.nextInt();

        System.out.println("Digite o segundo número");
        b = entrada.nextInt();

        System.out.println("Digite o terceiro número");
        c = entrada.nextInt();

        if (a==b && b==c) {
            System.out.println("Os números são iguais");
            System.exit(0);
            
        }else if (a>b && a>c){
            System.out.println("O maior número é: "+a);

        }else if (b>a && b>c) {
            System.out.println("O maior número é: "+b);
            
        }else if (c>a && c>b) {
            System.out.println("O maior número é: "+c);
            
        }

        entrada.close();
        
    }
}
