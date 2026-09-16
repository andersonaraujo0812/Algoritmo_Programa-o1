/*
Faça um algoritmo que receba dois números;
execute as operações listadas a seguir . . .
de acordo com a escolha do usuário.
Opção	Mensagem
M	    média entre os números digitados 
S	    diferença do maior pelo menor
P	    produto entre os números digitados 
D	    divisão do primeiro pelo segundo

*/

package SwitchCase;

import java.util.Scanner;

public class Operacao2Num {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a,b;


        System.out.println("Algoritmo para realizar operações entre 2 números\n");
        System.out.println("Digite o primeiro número: ");
        a = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = entrada.nextDouble();
        
        System.out.println("Digite a opção desejada: \nM    média entre os números digitados \n" + //
                        "S    diferença do maior pelo menor\n" + //
                        "P    produto entre os números digitados \n" + //
                        "D    divisão do primeiro pelo segundo");
        
        char c = entrada.next().toUpperCase().charAt(0);
           

        switch (c) {
            case 'M':

            a = (a+b)/2;
            System.out.println("A média entre os números é: "+a);
         
                break;

            case 'S':
            
                if(a>b){
                a = a-b;
}                  else{
                    a = b-a;
                }
            System.out.println("A diferença entre os números é: "+a);

                break;


            case 'P':
                a = a+b;
            System.out.println("O produto entre os números digitados é: "+a);

                break;


            case 'D':
                a = a/b;
                System.out.println("A divisão do primeiro pelo segundo é: "+a);
                
                break;

            default:
                System.out.println("Opção inválida.");
                break;


        }

        entrada.close();    
    
    }
}
