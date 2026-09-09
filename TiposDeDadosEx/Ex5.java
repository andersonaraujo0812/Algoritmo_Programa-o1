/*
Anderson de Araújo Júnior
Faça um algoritmo que leia três notas de um aluno:
– calcule e mostre a média aritmética do aluno.

*/
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = entrada.nextDouble();

        double notaF = (nota1+nota2+nota3)/3;

        System.out.printf ("A média aritmética das notas é: %.2f%n",notaF);

        entrada.close();
    }
}
