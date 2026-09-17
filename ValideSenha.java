/*
Faça um algoritmo que verifique a validade de uma senha 	fornecida pelo usuário.
sabendo que a senha é R10p5:
¨ imprimir mensagem de “acesso concedido” ou “acesso negado”.
Para comparar duas Strings utilizar o método equals();
ele retorna um valor booleano!
Exemplo:
¨ if(senha.equals("R10p5"))
 */

import java.util.Scanner;

public class ValideSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = "R10p5";

        System.out.println("Digite a senha para validação: ");
        String sen = entrada.nextLine();

        if (sen.equals(senha)) {
            System.out.println("Acesso concedido");
            
        }else{
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}
