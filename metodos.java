import java.util.Scanner;

public class Metodos {

    public static double areaCirculo(int radio) {
        
        double area= Math.PI*radio;
        System.out.println("el area del circulo es "+area);
        return area;
    }
    public static double areaCuadrado(int lado) {
        double area= Math.pow(lado,2);
        System.out.println("el area del cuadrado es: "+area);
        return area;
    }
    public static double areaTriangulo(int base, int altura) {
        double area=altura*base/2;
        System.out.println("el area del triangulo es: "+area);
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     boolean repet = true;
        do{
        System.out.println("que desesa calcular?");
        System.out.println("1.- area circulo");
        System.out.println("2.- area cuadrado");
        System.out.println("3.- area triangulo");
          System.out.println("4.- salir");
        int opc = in.nextInt();
        switch(opc){
            case 1:
                System.out.println("Ingresa el radio del ciculo");
                int radio = in.nextInt();
                areaCirculo(radio);
                break;
            case 2:
                System.out.println("ingrese lado del cuadrado");
                int lado= in.nextInt();
                areaCuadrado(lado);
                break;
            case 3:
                System.out.println("ingrese base del triangulo");
                int base= in.nextInt();
                System.out.println("ingrese altura del triangulo");
                int altura= in.nextInt();
                areaTriangulo(base,altura);
                break;
            case 4:
                repet= false;
                System.out.println("adios");
        }
      }while(repet);
      }

}
