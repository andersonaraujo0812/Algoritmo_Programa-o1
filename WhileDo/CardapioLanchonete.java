
/* 
Anderson de Araújo Júnior
Faça um algoritmo que leia o código do produto e a quantidade que o cliente deseja comprar.
O cliente pode comprar mais de um produto, pergunte se ele deseja continuar comprando.
Calcule o valor total a ser pago por cada produto e o valor total da compra 
*/

package WhileDo;

import java.util.Scanner;

public class CardapioLanchonete {
    
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int cardapio = 0;
        int quantidade = 0;
        double valorTotal = 0.0, valorParcial;

        do{
        System.out.println("Cardápio da lanchonete, escolha uma opção:\n");

        System.out.println("CÓDIGO 100 - CACHORRO QUENTE - R$1,20");
        System.out.println("CÓDIGO 101 - BAURU SIMPLES - R$1,30");
        System.out.println("CÓDIGO 102 - BAURU COM OVO - R$1,50");
        System.out.println("CÓDIGO 103 - HAMBÚRGER - R$1,20");
        System.out.println("CÓDIGO 104 - CHEESE BURGER - R$1,30");
        System.out.println("CÓDIGO 105 - REFRIGERANTE - R$1,00");
        System.out.println("\nCÓDIGO 0 - ENCERRAR PEDIDO \n");
    
        System.out.println("DIGITE O CÓDIGO DO PRODUTO DESEJADO: ");
        cardapio = entrada.nextInt();

        if (cardapio == 0) {
            
            break;
            
        }

        

        switch (cardapio) {
            case 100:

                System.out.println("\nCACHORRO QUENTE - R$1,20");
                System.out.println("\nDigite a quantidade desejada: ");
                quantidade = entrada.nextInt();
                valorParcial = quantidade*1.20;
                valorTotal += quantidade*1.20;
                System.out.println("Valor: R$"+valorParcial);
                System.out.println("Deseja continuar? SIM(1) NAO(0)");
                cardapio = entrada.nextInt();                             
                break;

            case 101:
                System.out.println("\nBAURU SIMPLES - R$1,30");
                System.out.println("\nDigite a quantidade desejada: ");
                quantidade = entrada.nextInt();
                valorParcial = quantidade*1.30;
                valorTotal += quantidade*1.30;
                System.out.println("Valor: R$"+valorParcial);  
                System.out.println("Deseja continuar? SIM(1) NAO(0)");
                cardapio = entrada.nextInt();
                break;

            case 102:   
                System.out.println("\nBAURU COM OVO - R$1,50");
                System.out.println("\nDigite a quantidade desejada: ");
                quantidade = entrada.nextInt();
                valorParcial = quantidade*1.50;
                valorTotal += quantidade*1.50;
                System.out.println("Valor: R$"+valorParcial);  
                System.out.println("Deseja continuar? SIM(1) NAO(0)");
                cardapio = entrada.nextInt();
                break;

            case 103:
                System.out.println("\nHAMBÚRGER - R$1,20");
                System.out.println("\nDigite a quantidade desejada: ");
                quantidade = entrada.nextInt();
                valorParcial = quantidade*1.20;
                valorTotal += quantidade*1.20;
                System.out.println("Valor: R$"+valorParcial);  
                System.out.println("Deseja continuar? SIM(1) NAO(0)");
                cardapio = entrada.nextInt();
                break;

            case 104:
                System.out.println("\nCHEESE BURGER - R$1,30");
                System.out.println("\nDigite a quantidade desejada: ");
                quantidade = entrada.nextInt();
                valorParcial = quantidade*1.30;
                valorTotal += quantidade*1.30;
                System.out.println("Valor: R$"+valorParcial);  
                System.out.println("Deseja continuar? SIM(1) NAO(0)");
                cardapio = entrada.nextInt();
                break;

            case 105:
                System.out.println("\nREFRIGERANTE - R$1,00");
                System.out.println("\nDigite a quantidade desejada: ");
                quantidade = entrada.nextInt();
                valorParcial = quantidade*1.00;
                valorTotal += quantidade*1.00;
                System.out.println("Valor: R$"+valorParcial);  
                System.out.println("Deseja continuar? SIM(1) NAO(0)");
                cardapio = entrada.nextInt();
                break;

            case 0:
                System.out.println("Pedido finalizado");
                break;
        
            default:
                System.out.println("Opção inválida, tente novamente!\n");
                break;
        } 

        
    } while (cardapio != 0);

        System.out.println("Pedido finalizado.");

        System.out.printf("Valor total R$ %.2f%n",valorTotal);

    

        entrada.close();
    }
}
