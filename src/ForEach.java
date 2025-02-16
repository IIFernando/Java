public class ForEach {
    public static void main(String[] args) {
        String alunos [] = {"Fernando", "Bruna", "Matheus", "Lavínia"};

        // for(int i = 0; i <= aluno.length; i++)
        // {
        //     System.out.printf("O indice %d se refere ao aluno %s", i, aluno[i]);
        //     System.out.println();
        // }

        //Usando FOREACH
        for (String aluno : alunos) 
        {
            System.out.printf("O nome do aluno é: %s", aluno);
            System.out.println();
        }
    }
}
