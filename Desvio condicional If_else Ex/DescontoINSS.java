/*

Ler o salário de uma pessoa e calcular e imprimir o desconto do 	
INSS (calculado‼) de acordo com a tabela a seguir:
<= R$ 600,00	Isento
R$ 600,00 e <= R$ 1200,00	20%
R$ 1200,00 e <= R$ 2000,00	25%
<= R$ 2000,00	30%

*/

import java.util.Scanner;

public class DescontoINSS {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cálculadora de desconto INSS\nDigite o valor do salário: ");
        double salario = entrada.nextDouble();

        if (salario<=600) {
            System.out.println("Isento ao desconto, salário à receber: "+ salario);
            
        }else if (salario > 600 && salario<=1200) {
            System.out.println("Desconto de 20%\nTotal à receber: "+ (salario-(salario*0.2)));

            
        }else if (salario > 1200 && salario <= 2000) {
            System.out.println("Desconto de 25%\nTotal à receber: "+ (salario-(salario*0.25)));
            
        }else   {
            System.out.println("Desconto de 30%\nTotal à receber: "+ (salario-(salario*0.3)));

        }


        entrada.close();
        
    }
}