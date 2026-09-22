/*
Anderson de Araújo Júnior
Faça um algoritmo que leia o período em que um aluno estuda:
M - Matutino;
V - Vespertino;
N - Noturno.
Escreva uma das opções a seguir:
Opção	Saudação
M	bom dia
V	boa tarde
N	boa noite
*/

package SwitchCase;

import java.util.Scanner;

public class PeriodoEstudo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Algoritmo para verificar o período que o aluno estuda\nDigite o período estudado: \nM - Matutino;\r\n" + //
                        "V - Vespertino;\r\n" + //
                        "N - Noturno. ");

            String periodo = entrada.next().toLowerCase();
            

        switch (periodo) {
            case "m":
                System.out.println("Bom dia.");
                break;
            case "v":
                System.out.println("Boa tarde.");
                break;
            case "n":
                System.out.println("Boa noite.");
                break;
        
            default:
                System.out.println("Valor inválido!");
                break;
        }

        entrada.close();
    }
    
}
