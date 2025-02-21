package exercicios;

import java.util.Scanner;

public class ex06 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double transacao01 = scanner.nextDouble();
        double transacao02 = scanner.nextDouble();
        double transacao03 = scanner.nextDouble();

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + transacao01 + transacao02 + transacao03;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
