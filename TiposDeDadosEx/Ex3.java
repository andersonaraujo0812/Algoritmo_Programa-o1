/*
Anderson de Araújo Júnior
Construir um algoritmo para ler dois números inteiros:
– e imprimir o seu produto
*/
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int primeiro = entrada.nextInt();

        System.out.println("Digite o segundo número");
        int segundo = entrada.nextInt();

        int a = (primeiro*segundo);

        System.out.println("O produto dos dois números é: "+a);
        entrada.close();

    }
}
