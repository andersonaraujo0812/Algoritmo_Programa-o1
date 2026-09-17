/*
Ler dois números (ponto flutuante) e apresentá-los em ordem 	
decrescente.
– supor que não sejam iguais.

*/

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Verificar ordem do maior para o menor.");
        
        System.out.println("Digite o primeiro número: ");
        Float primeiro = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        Float segundo = entrada.nextFloat();

        entrada.close();

        if (primeiro<segundo) {
            System.out.println("A ordem o maior para o menor é:  "+segundo+", "+primeiro);
            
        }else if (primeiro>segundo) {
            System.out.println("A ordem o maior para o menor é:  "+primeiro+", "+segundo);
        }else{
            System.out.println("Os números são iguais");
        }
    }
}
