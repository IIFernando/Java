import java.util.Locale;

public class CondicionalTernaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int nota = 4;

        // String resultado = nota >= 7? "Aprovado !":"Reprovado !"; // Ternário simples
        String resultado = nota >= 7? "Aprovado !": nota >= 5 && nota <7? "Recuperação": "Reprovado !"; //Ternário encadeado


        System.out.println(resultado);

    }
}
