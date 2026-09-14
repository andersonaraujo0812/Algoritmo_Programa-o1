/*
Faça um algoritmo que leia a altura e o sexo de uma pessoa:
calcule e mostre seu peso ideal.
usar as formulas a seguir para calcular o peso ideal:
¨ para o sexo masculino: p72, 7 ˆ alturaq ´ 58
¨ para o sexo feminino: p62, 1 ˆ alturaq ´ 44, 7

*/

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Calculadora para peso ideal.");

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble(),pIdeal;
        
        System.out.println("Digite seu sexo (Masculino/Feminino): ");
        String sexo = entrada.nextLine();



        if (sexo.equalsIgnoreCase("Feminino")||sexo.equalsIgnoreCase("F")) {
            pIdeal = (62.1*altura)-44.7;
            System.out.println("O seu peso ideal é: "+pIdeal+"Kg");
            
        }else if (sexo.equalsIgnoreCase("Masculino")||sexo.equalsIgnoreCase("M")) {
            pIdeal = (72.7*altura)-58.0;
            System.out.println("O seu peso ideal é: "+pIdeal+"Kg");
        }else{
            System.out.println("Sexo inválido");

        } 

        entrada.close();
    }
}
