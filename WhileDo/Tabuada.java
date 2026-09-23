/*
Faça um algoritmo que imprima a tabuada do 5.

*/
package WhileDo;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Algoritmo para imprimir a tabuada do 5");
        int a = 5,b = 1;

        while (b<=10) {
            System.out.println(a+" x "+b+" = "+a*b);
            b++;
        }
    }
    
}
