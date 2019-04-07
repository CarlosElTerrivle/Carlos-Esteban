package javarlos;

import java.util.Scanner;

public class Javarlos {
//Se  pide  desarrollar  un  algoritmo  que  permita  calcular  el  nuevo 
// salario  de  un  trabajador  si obtuvo un incremento del 10% sobre su salario anterior
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("ingrese su salario:");
        float salar = in.nextFloat();
        float aumento = (float) (salar*0.1)+salar ;
        System.out.println("su nuevo salario es "+aumento);
    }

}
