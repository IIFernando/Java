import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        String dia;

        switch(x) {
            case 1:
                dia = "Domingo";
                System.out.println("Dia da semana informado: " + dia);
                break;
                case 2:
                    dia = "Segunda";
                    System.out.println("Dia da semana informado: " + dia);
                    break;
                    case 3:
                        dia = "Terceira";
                        System.out.println("Dia da semana informado: " + dia);
                        break;
                        case 4:
                            dia = "Quarta";
                            System.out.println("Dia da semana informado: " + dia);
                            break;
                            case 5:
                                dia = "Quinta";
                                System.out.println("Dia da semana informado: " + dia);
                                break;
                                case 6:
                                    dia = "Sexta";
                                    System.out.println("Dia da semana informado: " + dia);
                                    break;
                                    case 7:
                                        dia = "Sabado";
                                        System.out.println("Dia da semana informado: " + dia);
                                        break;
        }

        sc.close();
        }
    }