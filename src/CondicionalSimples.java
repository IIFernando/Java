import java.util.Locale;
import java.util.Scanner;
// Condição simples
public class CondicionalSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double saldo = 0;
        double saque = 50;

        if(saque < saldo)
        {
            saldo -= saque;
            System.out.println("Seu saldo é de R$ " + saldo);
        }
        else
        {
            System.out.println("Você não tem saldo para efetuar está operação.");
        }

        sc.close();
    }
}
