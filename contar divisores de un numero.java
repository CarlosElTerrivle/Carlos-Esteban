package asdf;

import java.util.Scanner;

public class Asdf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = in.nextInt();
        int num2 = 0;
        int num3 = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("divisor: " + i);
                num2++;

            }
        }

        System.out.println("los divisores son: " + num2);
    }
}

