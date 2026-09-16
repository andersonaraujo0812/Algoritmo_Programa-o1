
import java.util.Scanner;




public class LivrosScanner {


    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite seu 1 livro favorito:");
        String livro1 = entrada.nextLine();
        System.out.println("digite seu 2 livro favorito:");
        String livro2 = entrada.nextLine();
        System.out.println("digite seu 3 livro favorito:");
        String livro3 = entrada.nextLine();
        System.out.println("digite seu 4 livro favorito:");
        String livro4 = entrada.nextLine();
        System.out.println("digite seu 5 livro favorito:");
        String livro5 = entrada.nextLine();

        System.out.println("seu 1 livro favorito é: "+livro1);
        System.out.println("seu 2 livro favorito é: "+livro2);
        System.out.println("seu 3 livro favorito é: "+livro3);
        System.out.println("seu 4 livro favorito é: "+livro4);
        System.out.println("seu 5 livro favorito é: "+livro5);

        entrada.close();


        

        

    }

}