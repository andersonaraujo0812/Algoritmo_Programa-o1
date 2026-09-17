/*

A prefeitura do Rio de Janeiro abriu uma linha de crédito para 	os funcionários estatuários.
o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
Exemplo:
Salário bruto: 1200,00
Valor da prestação: 400,00
Empréstimo não pode ser concedido!

*/

import java.util.Scanner;

public class LinhaCredito {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a,b;

        System.out.println("Verificar se a linha de crédito está disponível.\nDigite o valor do salário: ");
        a = entrada.nextDouble();
        
        System.out.println("Digite o valor da prestação: ");
        b = entrada.nextDouble();

        a = a*0.3;

        if (b>a) {
            System.out.println("Emprestimo não pode ser concedido");
            
        }else{
            System.out.println("Emprestimo pode ser concedido");
        }

        entrada.close();
    }
}
