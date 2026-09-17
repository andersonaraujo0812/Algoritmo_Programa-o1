/*
A empresa XSoftware concedeu um bônus de 20% do valor do salário a 	
todos os funcionários com tempos de trabalho na empresa igual ou 	
superior a cinco anos e de 10% aos demais funcionários.
Faça um algoritmo que leia o salário e a quantidade de anos de cada 	
funcionário, calcule e imprima o valor do bônus.

*/
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calcular valor do bonus na empresa.\nDigite o valor do seu salário: ");
        double salario = entrada.nextDouble(),x;

        System.out.println("Digite a quantidade de anos na empresa");
        int anos = entrada.nextInt();

        if (anos>=5) {
            x = salario*0.2;
            
        }else{
            x = salario*0.1;
        }
        
            System.out.println("O valor do bonus é: "+ x);
            System.out.println("Sálario + bonus: "+(salario+x));

        entrada.close();
    }
}
