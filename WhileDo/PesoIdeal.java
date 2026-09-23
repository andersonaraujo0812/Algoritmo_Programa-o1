/*
O IMC (índice de Massa Corporal) é uma medida do grau de obesidade 	de uma pessoa.
Faça um algoritmo que leia a altura e o peso de 10 pessoas.
	Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.

*/

package WhileDo;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso,altura;
        int a =1,b=0;

        System.out.println("Algoritmo para verificar se estão dentro do limite de obesidade");

        while (a<=10) {
            
        
        System.out.println("Digite o peso da "+a+" pessoa");
        peso = entrada.nextDouble();

        System.out.println("Digite a altura da "+a+" pessoa");
        altura = entrada.nextDouble();

            
        double imc = peso/Math.pow(altura, 2);
        System.out.printf("IMC: %.2f\n",imc);
        if (imc>=18.5 && imc<=24.9) {
            b++;
        }
        a++;

    }   System.out.println(b+" Pessoas estão com o peso considerado normal(IMC entre 18,5 e 24,9)");
        entrada.close();
    }
}
