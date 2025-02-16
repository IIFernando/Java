import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try{
        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura");
        double altura = sc.nextInt();

        //Imprimindo as entradas do usuário.
        System.out.println("Olá me chamo " + nome.toUpperCase());
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("E minha altura é " + altura + "cm.");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Os campos idade e altura precisam ser númericos.");
        }

        sc.close();
    }
}
