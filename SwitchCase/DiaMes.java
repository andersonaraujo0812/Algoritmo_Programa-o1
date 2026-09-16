/*
Faça um algoritmo que leia um inteiro entre 1 e 12;
– imprima o nome do mês por extenso.

*/

package SwitchCase;

import java.util.Scanner;

public class DiaMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verificar o mês digitado\nDigite um número de 1 a 12");
        int ano = entrada.nextInt();

        switch (ano) {
            case 1:
                System.out.println("Mês 1 - Janeiro");
                
                break;
            case 2:
                System.out.println("Mês 2 - Fevereiro");
                
                break;
            case 3:
                System.out.println("Mês 3 - Março");
                
                break;
            case 4:
                System.out.println("Mês 4 - Abril");
                
                break;
            case 5:
                System.out.println("Mês 5 - Maio");
                
                break;
            case 6:
                System.out.println("Mês 6 - Junho");
                
                break;
            case 7:
                System.out.println("Mês 7 - Julho");
                
                break;
            case 8:
                System.out.println("Mês 8 - Agosto");
                
                break;
            case 9:
                System.out.println("Mês 9 - Setembro");
                
                break;
            case 10:
                System.out.println("Mês 10 - Outubro");
                
                break;
            case 11:
                System.out.println("Mês 11 - Novembro");
                
                break;
            case 12:
                System.out.println("Mês 12 - Dezembro");
                
                break;
            
            default:
                System.out.println("Número inválido.");
                break;
        }


        entrada.close();
    }
}
