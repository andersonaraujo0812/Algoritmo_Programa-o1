/*
Crie um algoritmo que leia um número de 1 a 7.
imprima o dia da semana correspondente;
assuma que 1 corresponde ao Domingo.

*/

package SwitchCase;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificar o dia da semana\nDigite o número de 1 a 7");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Dia 1 - Domingo");
                break;
        
            case 2:
                System.out.println("Dia 2 - Segunda-Feira");
                break;
            case 3:
                System.out.println("Dia 3 - Terça-Feira");
                break;
            case 4:
                System.out.println("Dia 4 - Quarta-Feira");
                break;
            case 5:
                System.out.println("Dia 5 - Quinta-Feira");
                break;
            case 6:
                System.out.println("Dia 6 - Sexta-Feira");
                break;
            case 7:
                System.out.println("Dia 7 - Sábado");
                break;
            default:
                System.out.println("Dia digitado inválido");
                break;
        }


        entrada.close();
    }
}
