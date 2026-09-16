/*
Um funcionário receberá aumento de acordo com seu plano de 	trabalho.
Faça um algoritmo que leia:
¨ o plano de trabalho;
¨ e o salário atual de um funcionário;
Calcule e imprima o seu novo salário.
Plano    Aumento
A           10%
B           15%
C           20%

*/

package SwitchCase;

import java.util.Scanner;

public class PlanoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Progama para verificar o plano de trabalho e calcular o aumento de salário.\nDigite o plano de trabalho escolhido: A,B,C");
        char plano = entrada.next().toUpperCase().charAt(0);

        System.out.println("Digite o valor do seu salário: ");
        double salario = entrada.nextDouble();
        

        switch (plano) {
            case 'A':

            salario += salario*0.1;

            System.out.println("Aumento de 10%.\nNovo salário: "+salario);
                
                break;
        
            case 'B':

                salario += salario*0.15;

                System.out.println("Aumento de 15%.\nNovo salário: "+salario);

                
                break;
        
            case 'C':

            salario += salario*0.2;

            System.out.println("Aumento de 20%.\nNovo salário: "+salario);
                
                break;
        
            default:
                System.out.println("Plano digitado inválido.");
                break;
        }


        entrada.close();
    }
}
