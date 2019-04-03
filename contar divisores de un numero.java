package asdf;

import java.util.Scanner;

public class Asdf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = in.nextInt();
        int num2 = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("divisor: " + i);
                num2++;
            }
        }
/**       if (num2 == 2) {
            System.out.println("es numero primo");

        } else {
            if (!(num2 == 2)) {
                System.out.println("el numero no es primo");
/*         }
        }

    }

}
