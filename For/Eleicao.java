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

        System.out.println("Algoritmo para receber os votos de 10 candidatos");

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, brancos = 0, nulos = 0,i;
        double mediaBrancos, mediaNulos;

        for(i = 1;i<=10;i++){

            System.out.println("\n1, 2, 3 ou 4 - Voto para o respectivo candidato\r\n" + //
                                "5 - Voto nulo\r\n" + //
                                "6 - Voto em branco");
            System.out.println("\nDigite qual candidato deseja votar: ");
            int voto = entrada.nextInt();

            while (voto<1 || voto>6) {
                System.out.println("Voto inválido, tente novamente: ");
                voto = entrada.nextInt();
                
            }

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
            
                default:
                    System.out.println("Voto inválido");
                    break;
            }
        }


            System.out.println("O total de votos para cada candidato é: \n");
            System.out.println("Candidato 1: "+candidato1+" votos.");
            System.out.println("Candidato 2: "+candidato2+" votos.");
            System.out.println("Candidato 3: "+candidato3+" votos.");
            System.out.println("Candidato 4: "+candidato4+" votos.");
            System.out.println("\nNulos: "+nulos+" votos.");
            System.out.println("Brancos: "+brancos+" votos.");

            System.out.println("O percentual de votos brancos é: "+mediaBrancos);
        

        entrada.close();
    }
}
