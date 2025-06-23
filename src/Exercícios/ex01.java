package Exercícios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (true)
        {
            senha = sc.nextInt();
            if (senha != 2002)
            {
                System.out.println("Senha inválida.");
            }
            else
            {
                System.out.println("Acesso Permitido.");
                break;
            }
        }

        sc.close();
    }
}
