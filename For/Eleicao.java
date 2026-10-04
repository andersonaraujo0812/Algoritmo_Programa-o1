/*
Em uma eleição presidencial, existem quatro candidatos.
Os votos são informados através de um código:
¨ 1, 2, 3 ou 4 - Voto para o respectivo candidato
¨ 5 - Voto nulo
¨ 6 - Voto em branco
Faça um algoritmo que leia o voto de 10 eleitores.
Calcule e mostre:
¨ a) O total de votos para cada candidato;
¨ b) O total de votos nulos;
¨ c) O total de votos em branco;
¨ d) O percentual dos votos brancos e nulos.


*/
package For;
import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulos = 0, brancos = 0;
        System.out.println("Eleição presidencial \n1,2,3 ou 4 - Voto para o respectivo candidato\n5 - Voto nulo\n6 - Voto em branco");


        for (int i = 1; i <= 10; i++) {
            System.out.println("Eleitor " + i);
            System.out.println("Digite o voto (1-6): ");
            int voto = entrada.nextInt();
            while (voto < 1 || voto > 6) {
                System.out.println("Voto inválido. Digite novamente (1-6): ");
                voto = entrada.nextInt();
            }

            switch (voto) {
                case 1:
                    candidato1++;
                    System.out.println("Voto para o candidato 1");
                    break;
                case 2:
                    candidato2++;   
                    System.out.println("Voto para o candidato 2");
                    break;
                case 3:
                    candidato3++;
                    System.out.println("Voto para o candidato 3");
                    break;
                case 4:
                    candidato4++;
                    System.out.println("Voto para o candidato 4");
                    break;
                case 5:
                    nulos++;
                    System.out.println("Voto nulo");
                    break;
                case 6:
                    brancos++;
                    System.out.println("Voto em branco");
                    break;
                default:
                    System.out.println("Voto inválido");
            }
        }

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);

        System.out.println("Percentual de votos nulos: " + (nulos / 10.0 * 100) + "%");
        System.out.println("Percentual de votos em branco: " + (brancos / 10.0 * 100) + "%");


        entrada.close();
        
        
    }
    
}
