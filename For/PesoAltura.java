/*
Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas, 	calcule e mostre:
a) A quantidade de pessoas maiores de 50 anos.
b) A média das alturas das pessoas com idade entre 10 e 20 anos.
c) A porcentagem de pessoas com peso inferior a 40 quilos.

*/
package For;
import java.util.Locale;
import java.util.Scanner;

public class PesoAltura {   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int idade, contIdade = 0, contAltura = 0, contPeso = 0;
        double altura, peso, mediaAltura = 0, percPeso = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i);
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();
            System.out.println("Digite a altura: ");
            altura = entrada.nextDouble();
            System.out.println("Digite o peso: ");
            peso = entrada.nextDouble();

            if (idade > 50) {
                contIdade++;
            }
            if (idade >= 10 && idade <= 20) {
                mediaAltura += altura;
                contAltura++;
            }
            if (peso < 40) {
                contPeso++;
            }
        }

        if (contAltura > 0) {
            mediaAltura /= contAltura;
        }
        percPeso = (contPeso / 10.0) * 100;

        System.out.println("Quantidade de pessoas maiores de 50 anos: " + contIdade);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAltura);
        System.out.println("Percentual de pessoas com peso inferior a 40 quilos: " + percPeso + "%");



        entrada.close();
    }
    
}
