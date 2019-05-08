public class Kino {

    public static Random rnum = new Random();

    public static void main(String[] args) {
        boolean ret = true;

        do {
            int[][] cartonGanador = generaCarton(20, 5, 4);
            mostrarCarton(cartonGanador);
            int[][] carton1 = generaCarton(20, 5, 4);
            int coincidencias = comparar(cartonGanador, carton1);
            System.out.println(coincidencias);
            System.out.println("==================================");
            if (coincidencias == 3) {
                ret = false;
            }
        } while (ret);
    }

    public static int[][] generaCarton(int largo, int dim1, int dim2) {
        int[] arr = generarArreglo(largo);

        ordenar(arr);
        int[][] mat = new int[dim1][dim2];
        int contador = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = arr[contador];
                contador++;
            }

        }

        return mat;

    }

    public static void mostrarCarton(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("[ " + mat[i][j] + " ]");
            }
            System.out.println(" ");
        }

    }

    public static int[] generarArreglo(int largo) {
        int[] arr = new int[largo];
        llenarArrSinRepetir(arr, 200);
        return arr;
    }

    public static void llenarArrSinRepetir(int[] arr, int rango) {
        if (rango < arr.length) {
            rango = arr.length;
        }
        boolean bandera = false;
        int random;

        for (int i = 0; i < arr.length; i++) {
            do {
                bandera = false;
                random = rnum.nextInt(rango) + 1;
                for (int j = 0; j <= i; j++) {
                    if (arr[j] == random) {
                        bandera = true;
                    }
                }
            } while (bandera);
            arr[i] = random;
        }

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

    public static int comparar(int[][] mat1, int[][] mat2) {
        int contador = 0;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                for (int k = 0; k < mat2.length; k++) {
                    for (int l = 0; l < mat2[k].length; l++) {
                        if (mat1[i][j] == mat2[k][l]) {
                            contador++;
                        }
                    }
                }
            }
        }
        return contador;
    }

}
