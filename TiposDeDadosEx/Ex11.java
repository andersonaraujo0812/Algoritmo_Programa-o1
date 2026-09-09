/*
Anderson de Araújo Júnior
Construir um algoritmo que leia:
o ano de nascimento de uma pessoa e o ano atual.
Calcule e mostre:
a idade dessa pessoa;
quantos anos essa pessoa terá em 2030.

*/
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoAtual,anoNascimento, idade, idade2030;
        System.out.println("Digite o ano de nascimento");
        anoNascimento = entrada.nextInt();

        System.out.println("Digite o ano atual: ");
        anoAtual = entrada.nextInt();

        idade = anoAtual-anoNascimento;
        idade2030 = 2030-anoNascimento;

        System.out.println("A idade atual é de: "+ idade);
        System.out.println("A idade em 2030 será: "+ idade2030);


        

        entrada.close();
    }
}
