package POO;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        POO.Package.Triangle x, y;
        x = new POO.Package.Triangle();
        y = new POO.Package.Triangle();

        System.out.println("Digite o valor de X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o valor de Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.println("Area X: " + areaX);
        System.out.println("Area Y: " + areaY);

        if (areaX > areaY)
        {
            System.out.println("A area X é a maior");
        }
        else
        {
            System.out.println("A area Y é a maior");
        }
        
        sc.close();
    }
}
