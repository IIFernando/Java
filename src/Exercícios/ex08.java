package Exercícios;
import POO.Package.Pessoa;
import POO.Package.Quadrado;
import POO.Package.Retangulo;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela
        a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos".

            System.out.println("Informe seu nome: ");
            String name = sc.next();
            System.out.println("Informe sua idade: ");
            int age = sc.nextInt();
            System.out.printf("Olá %s você tem %d anos.", name, age);
        */

        /*
        Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
        Fórmula: área=lado X lado

        Quadrado quadrado = new Quadrado();
        quadrado.setArea(4);
        quadrado.calcularArea();
        */

        /*
        Escreva um código que receba a base e a alturade de um retângulo, calcule sua área e exiba na tela.
        Fórmula: área = base X altura
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(7);
        retangulo.setAltura(9);
        retangulo.RetornoRetangulo();
        */

        /*
        Escreva um código que receba o nome e a idade de 2 pessoas e imprima
         a diferença de idade entre elas.
        */

        Pessoa pessoa1 = new Pessoa("Fernando", 36);
        Pessoa pessoa2 = new Pessoa("Matheus", 10);

        System.out.printf("A diferença de idade entre vocês é de: %d", pessoa1.getIdade() - pessoa2.getIdade());
        
        sc.close();
    }
}


