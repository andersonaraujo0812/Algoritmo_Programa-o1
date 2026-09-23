/*
Faça um algoritmo que imprima a metade de cada número de 10 a 20.
– Exemplo:
¨ a metade de 10 é 5.0
¨ a metade de 11 é 5.5
¨ a metade de 12 é 6.0
¨ . . .
¨ a metade de 18 é 9.0
¨ a metade de 19 é 9.5
¨ a metade de 20 é 10.0
*/
package WhileDo;

public class Metade {
    public static void main(String[] args) {
        double numero = 10;
        System.out.println("Algoritmo para escrever a metade dos números ente 10 e 20");

        while (numero<=20) {
            System.out.println("A metade de "+numero+" é "+numero/2);
            numero ++;
        }
    }
}
