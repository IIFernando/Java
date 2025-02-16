import java.util.Locale;

// Condição composta.
public class CondicionalComposta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double nota = 10;

        if(nota >= 7)
        {
            System.out.println("Aprovado !");
        }
        else if (nota >= 5 && nota < 7)
        {
            System.out.println("Recuperação !");  // Condicional encadeada.
        }
        else
        {
            System.out.println("Reprovado !");
        }
    }
}
