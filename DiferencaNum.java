/*

Ler dois valores inteiros:
e se forem iguais, mostrar “Números iguais”;
caso contrário, apresentar a diferença do maior pelo menor.

*/

import java.util.Scanner;

public class DiferencaNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite o primeiro número: ");
            a = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
            b = entrada.nextInt();

            if (a==b) {
                System.out.println("Números iguais");
                
            }else if (a>b) {
                c = a-b;
                System.out.println("A diferença do maior para o menor é: "+c);
            }else{
                c = b-a;
                System.out.println("A diferença do maior para o menor é: "+c);
            }


        entrada.close();

    }
    
}
