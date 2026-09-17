/*
Faça um algoritmo que:
receba a idade de uma pessoa;
se for maior de idade imprima: “maior de idade”;
senão imprima: “menor de idade”.

*/

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        if (idade>=18) {

            System.out.println("Maior de idade");
            
        }else{
            System.out.println("Menor de idade");
        }
        entrada.close();
    }
}
