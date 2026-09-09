/*
Anderson de Araújo Júnior
Faça um algoritmo para imprimir em cada linha o resultado 	
lógico das seguintes expressões:

((120 - 30) = (3 ˆ 30))
(não ((20 módulo 4)/2= 1) ou (9 != 9))
((5 módulo 2 ) > 3)
(a = A)



*/

public class Ex7 {  
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        boolean a = (120-30)== Math.pow(30, 30);
        boolean b = (!((20%4)/2==1) || (9 != 9));
        boolean c = ((5%2)>3);
        boolean d = ('a'=='A');
        
        System.out.println("A expressão ((120 - 30) = (3 ˆ 30)) é: "+a);
        System.out.println("A expressão (não ((20 módulo 4)/2= 1) ou (9 != 9)) é: "+b);
        System.out.println("A expressão ((5 módulo 2 ) > 3) é: "+c);
        System.out.println("A expressão (a = A) é: "+d);
        
        
        
    }
    
}
