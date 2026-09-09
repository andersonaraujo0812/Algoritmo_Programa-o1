/*
Faça um algoritmo que receba a idade de um nadador e 	
imprima a sua categoria seguindo as regras:
Categoria	Idade

infantilA  5 - 7 anos
infantilB  8 - 10 anos
juvenilA   11-13 anos
juvenilB   14-17 anos 
Sênior     18 anos ou mais


*/

import java.util.Scanner;

public class IdadeNadador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Definir a categoria do nadador com base na idade.\nDigite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade>=5 && idade<=7) {
            System.out.println("Categoria: infantil A");
            
        }else if (idade>=8 && idade<=10) {
            System.out.println("Categoria: infantil B");
                      
        }else if (idade>=11 && idade<=13) {
            System.out.println("Categoria: juvenil A");
            
        }else if (idade>=14 && idade<=17) {
            System.out.println("Categoria: juvenil B");
            
        }else if (idade>18) {
            System.out.println("Categoria: Sênior");
            
        }else{
            System.out.println("Sem categoria");
        }
        entrada.close();
        
    }
}
