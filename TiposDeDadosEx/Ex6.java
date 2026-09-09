/*
Anderson de Araújo Júnior
Faça um algoritmo que calcule e imprima o valor de cada 
expressão a seguir:
– (20 - 15)/2
– 2 ˆ (5/20) + 30 / (15 ˆ 2)
– 35 / (6 + 2)
– 23 módulo 4
*/
public class Ex6 {
    public static void main(String[] args) {
        double a = (20.0-15.0)/2;
        double b = (Math.pow(2.0, 0.25)+30)/ Math.pow(15.0, 2.0);
        double c = 35.0/(6+2);
        double d = 23%4;
        
        System.out.println("(20 - 15)/2 = "+a);
        System.out.println("2 ˆ (5/20) + 30 / (15 ˆ 2) = "+b);
        System.out.println("35 / (6 + 2) = "+c);
        System.out.println("3 módulo 4 = "+d);
        
    }
}
