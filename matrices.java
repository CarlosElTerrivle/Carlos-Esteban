mport java.util.Random;

public class JavaApplication14 {
        
    public static void main(String[] args) {
        int dim = 3;
        int rango = 50; 
        int[][] matriz = new int[dim][dim];
        mostrar(matriz);
        System.out.println("==========================");
        llenar(matriz, rango);
        mostrar(matriz);
        int p = perimetro(matriz);
        System.out.println("Perimetro: "+p);
        System.out.println("==========================");
        
        int[] diagonal1 =new int[dim];
        int[] diagonal2 =new int[dim];
        int d = sumaDiagonales(matriz, diagonal1, diagonal2);
        mostrarArr(diagonal1);
        mostrarArr(diagonal2);
        System.out.println("Suma Diagonal: "+ d);
        System.out.println("==========================");
        
        sumaEsquinas(matriz);
        System.out.println("==========================");
        
        int[][] matrizT = transponer(matriz);
        mostrar(matrizT);
        
        
    }
    
    

    private static void llenar(int[][] mat, int num) {
        Random rnum = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=rnum.nextInt(num);
            }
        }
    }

    private static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+ matriz[i][j]+"\t]");
            }
            System.out.println("");
        }
    }

    private static int perimetro(int[][] matriz) {
        int acumulador = 0;
        for (int i = 0; i < matriz.length; i++) {
            acumulador+= matriz[0][i];
            acumulador+= matriz[matriz.length-1][i];
            acumulador+= matriz[i][0];
            acumulador+= matriz[i][matriz.length-1];
        }
        acumulador -= matriz[0][0];
        acumulador -= matriz[matriz.length-1][matriz.length-1];
        acumulador -= matriz[0][matriz.length-1];
        acumulador -= matriz[matriz.length-1][0];
        return acumulador;
    }

    private static int sumaDiagonales(int[][] matriz, int[] arr1, int[] arr2) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            arr1[i] = matriz[i][i]; 
            arr2[i] = matriz[matriz.length-1-i][i]; 
            
            suma += (arr1[i]+arr2[i]);
        }
        
        return suma;
    }

    private static void mostrarArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"\t]");
        }
        System.out.println("");
    }

    private static void sumaEsquinas(int[][] matriz) {
        int suma = 0;
        suma += matriz[0][0];
        suma += matriz[matriz.length-1][matriz.length-1];
        suma += matriz[0][matriz.length-1];
        suma += matriz[matriz.length-1][0];
        
        System.out.println("Esquinas: "+ suma);
    }

    private static int[][] transponer(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta.length; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        
        return transpuesta;
    }
    
    
    
}
