 
 
 /*
Desenvolver um algoritmo para definir se uma pessoa está apta 	a votar no Brasil.
Pesquise: Quais são as regras para se votar no Brasil?
Identifique quais os dados de entrada necessários para resolver o problema.
Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.
Faça um programa que pede as informações necessárias e verifica se 	uma pessoa está apta a votar.
 */

import java.util.Scanner;

public class RegrasVotar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preencha os dados para verificar se está apto para votar.");



        System.out.println("Você é brasileiro?(S/N)");
        String nacionalidade = entrada.nextLine().toLowerCase();

        if (nacionalidade.equals("n")){
            System.out.println("Você não pode votar sendo estrangeiro");
            System.exit(0);
        }

        System.out.println("Você está com seu documento de identidade?(S/N)");
        String documento = entrada.nextLine().toLowerCase();

        if (documento.equals("n")){
            System.out.println("Você não pode votar sem o seu documento");
            System.exit(0);
        }

        System.out.println("Você está com seu título de eleitor regular(S/N)?");
            String titulo = entrada.nextLine().toLowerCase();
        if (titulo.equals("n")){
            System.out.println("Você não pode votar sem regular seu título de eleitor");
            System.exit(0);
        }
        
        
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade<16) {
            System.out.println("Sua idade não permite você votar!");
        }else if (idade>=70) {
            System.out.println("Você pode votar, mas não é obrigatório!");

        }else {
                System.out.println("Você está apto para votar!");

        
                }

        
        entrada.close();
    }
}