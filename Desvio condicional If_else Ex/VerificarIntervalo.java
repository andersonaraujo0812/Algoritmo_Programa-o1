/*
Faça um algoritmo para ler um número inteiro.
verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive);
se estiver:
¨ imprimir “Pertence ao intervalo”;
senão:
¨ imprimir “Não pertence ao intervalo”

*/

import java.util.Scanner;

public class VerificarIntervalo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Verificar se o numero está dentro do intervalo.\nDigite o número: ");
        int a = entrada.nextInt();

        if (a>=50 && a<=100) {
            System.out.println("Pertence ao intervalo");            
        }else{
            System.out.println("Não pertence ao intervalo");

        }
        entrada.close();
    }
}
