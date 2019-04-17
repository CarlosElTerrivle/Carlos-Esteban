public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnum = new Random();
        System.out.println("defina el largo del arreglo: ");
        int a = in.nextInt();
        int[] arreglo = new int[a];
        int numpar = 0;
        int numinpar = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnum.nextInt(100);
            //contar numeros pares
            System.err.println(arreglo[i]);
            if (arreglo[i] % 2 == 0) {
                numpar++;
            } else {
                numinpar++;
            }

        }
        System.out.println("numeros pares " + numpar);
        System.out.println("numeros impares " + numinpar);
        int numprimo=0;
        for (int b = 0; b < arreglo.length; b++) {
            int div = 0;
            for (int i = 1; i < 666; i++) {
                if (arreglo[b] % i == 0) {
                    div++;
                }
            }
//           System.out.println("el num: " + arreglo[b]);
            if (div == 2) {
                numprimo++;
//                System.out.println("es numero primo");
//            } else {
//                System.out.println("no es numero primo");
//            }
            }
        }
        
        System.out.println("numeros primos " + numprimo);

    }
}
