
import java.util.Random;

public class pasoPorValor {

    public static int sumarArr(int[] arr) {
        int suma = 0;

        return suma;
    }

    public static String imprimir(String a) {
        a = "palabra: " + a;
        return a;

    }

    public static void llenarArr(int[] arr) {
        Random rnum = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnum.nextInt(50) + 1;
        }
    }

    public static void llenarArrSinRepetir(int[] arr, int rango) {
        if (rango < arr.length) {
            rango = arr.length;
        }
        Random rnum = new Random();
        boolean bandera = false;
        int random = rnum.nextInt(50);

        for (int i = 0; i < arr.length; i++) {
            do {
                bandera = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == random) {
                        bandera = true;
                    }
                }
            } while (bandera);
            arr[i] = random;
        }

    }

    public static void imprimirArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[ " + arr[i] + " ]");
        }
        System.out.println(" ");
    }

    public static void ordenar(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static int contarLetras(String[] arr, char letra) {
        int contador = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == letra) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        /*String[] palabras = {"carlos", "juana", "miguel", "nicolas"};
        System.out.println("hay un total de " + contarLetras(palabras, 'a') + "  letras A");
        System.out.println("hay un total de " + contarLetras(palabras, 'e') + "  letras E");
        System.out.println("hay un total de " + contarLetras(palabras, 'i') + "  letras I");
        System.out.println("hay un total de " + contarLetras(palabras, 'o') + "  letras O");
        System.out.println("hay un total de " + contarLetras(palabras, 'u') + "  letras U");*/
        int[] arreglo1 = new int[10];
        //imprimirArr(arreglo1);
        llenarArr(arreglo1);
        imprimirArr(arreglo1);
        ordenar(arreglo1);
        imprimirArr(arreglo1);
        llenarArrSinRepetir(arreglo1, 50);
    }

}
