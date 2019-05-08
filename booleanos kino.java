public static Random rnum = new Random();

    public static void main(String[] args) {

        boolean[] arr = new boolean[200];

        while (verificar(arr, 20)) {
            llenar(arr, 20);
        }
        mostrar(arr);
        mostrarMat(arr, 5, 4);

    }

    private static void llenar(boolean[] arr, int rango) {
        int i = 0;
        while (i <= rango) {
            int random = rnum.nextInt(200);
            if (!arr[random]) {
                arr[rnum.nextInt(200)] = true;
                i++;
            }
        }
    }

    private static void mostrar(boolean[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]) {
                System.out.print("[" + j + "]");
            }
        }
        System.out.println("");
    }

    private static void mostrarMat(boolean[] arr, int dim1, int dim2) {
        int c = 0;
        for (int i = 0; i < dim1; i++) {
            for (int j = 0; j < dim2; j++) {
                do {
                    if (arr[c]) {
                        System.out.print("[" + c + "]");
                    }
                    c++;
                } while (!arr[c - 1]);
            }
            System.out.println("");
        }
    }

    public static void mostrarMat2(boolean[] arr, int dim1, int dim2) {
        int[] arr2 = new int[dim1 * dim2];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i]) {
                arr2[j] = i;
                j++;
            }
        }
        //completar

    }

    private static boolean verificar(boolean[] arr, int num) {
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                cont++;
            }
        }
        if (cont < num) {
            return true;
        } else {
            return false;
        }
    }

}

