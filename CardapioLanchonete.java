/* 
Faça um algoritmo que:
crie um cardápio simples;
leia o código do produto e a quantidade;
calcule o valor a ser pago pelo cliente;
imprimir o valor a ser pago;
imprimir o nome do produto 
*/

import java.util.Scanner;

public class CardapioLanchonete {
    
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int cardapio = 0;
        int quantidade =0;
        double valorTotal = 0.0;

        do{
        System.out.println("Cardápio da lanchonete, escolha uma opção:\n");

        System.out.println("CÓDIGO 100 - CACHORRO QUENTE - R$1,20");
        System.out.println("CÓDIGO 101 - BAURU SIMPLES - R$1,30");
        System.out.println("CÓDIGO 102 - BAURU COM OVO - R$1,50");
        System.out.println("CÓDIGO 103 - HAMBÚRGER - R$1,20");
        System.out.println("CÓDIGO 104 - CHEESE BURGER - R$1,30");
        System.out.println("CÓDIGO 105 - REFRIGERANTE - R$1,00");
        System.out.println("CÓDIGO 0 - ENCERRAR PEDIDO \n");
    
        System.out.println("DIGITE O CÓDIGO DO PRODUTO DESEJADO: ");
        cardapio = entrada.nextInt();

        if (cardapio == 0) {
            
            break;
            
        }

        

        switch (cardapio) {
            case 100:

                System.out.println("CACHORRO QUENTE - R$1,20");
                System.out.println("Digite a quantitade desejada: ");
                quantidade = entrada.nextInt();

                valorTotal += quantidade*1.20;                               
                break;

            case 101:
                System.out.println("BAURU SIMPLES - R$1,30");
                System.out.println("Digite a quantitade desejada: ");
                quantidade = entrada.nextInt();
                valorTotal += quantidade*1.30;
                break;

            case 102:   
                System.out.println("BAURU COM OVO - R$1,50");
                System.out.println("Digite a quantitade desejada: ");
                quantidade = entrada.nextInt();
                valorTotal += quantidade*1.50;
                break;

            case 103:
                System.out.println("HAMBÚRGER - R$1,20");
                System.out.println("Digite a quantitade desejada: ");
                quantidade = entrada.nextInt();
                valorTotal += quantidade*1.20;
                break;

            case 104:
                System.out.println("CHEESE BURGER - R$1,30");
                System.out.println("Digite a quantitade desejada: ");
                quantidade = entrada.nextInt();
                valorTotal += quantidade*1.30;
                break;

            case 105:
                System.out.println("REFRIGERANTE - R$1,00");
                System.out.println("Digite a quantitade desejada: ");
                quantidade = entrada.nextInt();
                valorTotal += quantidade*1.00;
                break;

            case 0:
                System.out.println("Pedido finalizado");
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }

        
    } while (cardapio != 0);

        System.out.println("Pedido finalizado.");

        System.out.printf("Valor total R$ %.2f%n",valorTotal);

    

        entrada.close();
    }
}
