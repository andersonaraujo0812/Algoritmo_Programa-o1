/*
Criar uma calculadora de operações básicas:
soma, subtração, multiplicação e divisão.
o algoritmo deve ler dois números e o sinal correspondente à operação desejada;
utilize o tipo char para ler a operação;
no final deve ser impresso o resultado.
Restrições:
se o sinal digitado não corresponder a uma operação. . .
¨ apresentar a mensagem Sinal Inválido e finalizar.
para a operação de divisão verificar se o divisor é válido (maior que zero)!
¨ caso seja menor ou igual a zero, informar a mensagem “Impossível dividir‼”


*/

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora simples");
        System.out.println("Digite o primeiro número da operação: ");
        double primeiro = entrada.nextDouble();

        System.out.println("Digite o sinal da operação (+ - / * ): ");
        char sinal = entrada.next().charAt(0);

        System.out.println("Digite o segundo número da operação: ");
        double segundo = entrada.nextDouble();

        if (sinal == '+') {
            System.out.println(primeiro+" + "+segundo+" igual a: "+ (primeiro+segundo));
            
        }else if (sinal == '-') {
            System.out.println(primeiro+" - "+segundo+" igual a: "+ (primeiro-segundo));
            
        }else if (sinal == '/') {
            if (segundo <=0) {
                System.out.println("Impossível dividir");
                System.exit(0);
                
            }
            System.out.println(primeiro+" / "+segundo+" igual a: "+ (primeiro/segundo));
            
        }else if (sinal == '*') {
            System.out.println(primeiro+" * "+segundo+" igual a: "+ (primeiro*segundo));
            
        }else {
            System.out.println("Sinal digitado é inválido, tente novamente.");
        }

        entrada.close();
    }
}