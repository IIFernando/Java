package Exercícios;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma opção: ");

        int op = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(op != 4)
        {
            System.out.println("Cliente informe sua opção");
            op = sc.nextInt();

            switch(op){

                case 1:
                    System.out.println("Você irá abastecer com Alcool!");
                    alcool += 1;
                    break;

                    case 2:
                        System.out.println("Você irá abastecer com Gasolina!");
                        gasolina += 1;
                        break;

                        case 3:
                            System.out.println("Você irá abastecer com Diesel!");
                            diesel += 1;
                            break;

                            case 4:
                                System.out.println("Muito obrigado!");
                                System.out.println("Alcool: " + alcool);
                                System.out.println("Gasolina: " + gasolina);
                                System.out.println("Diesel: " + diesel);
                                break;

                                default:
                                    System.out.println("Código inválido tente novamente.");

            }

        }

        sc.close();
    }
}
