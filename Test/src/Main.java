import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvad er x");
        x = scanner.nextDouble();
        System.out.println("Hvad er y");
        y = scanner.nextDouble();

        z = sqrt(x*x + y*y);

        System.out.println();
        System.out.println(z);


    }
}
