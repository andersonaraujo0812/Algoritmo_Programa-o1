import java.util.Scanner;

public class RegrasVotar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preencha os dados para verificar se está apto para votar.");


        System.out.println("Você está com seu documento de identidade?");
        String documento = entrada.nextLine().toLowerCase();

        if (documento.matches("(?i)nao|n|não")){
            System.out.println("você não pode votar sem o seu documento");
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