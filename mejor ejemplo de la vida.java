package funciones;

import java.util.Random;

public class Paso {
    public static int sumar(int num1, int num2){
        num2 = num1+ num2;
        return num2;
    }
    
    public static int sumaArreglo(int[] arr){
        
        int suma=0;
        for(int i=0;i<arr.length;i++){
           suma+=arr[i]; 
        }
        return suma;
    }
    
    public static void llenarArreglo(int[] arr){
        
        Random rnum = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rnum.nextInt(100);
        }
        
    }public static void llenarArregloSinRepetir(int[] arr, int rango){
        if(rango < arr.length){
            rango = arr.length;
        }
        
        Random rnum = new Random();
        boolean bandera = false;
        int random;
        
        for(int i=0;i<arr.length;i++){
            do{
                bandera=false;
                random = rnum.nextInt(rango);
                for(int j=0;j<=i;j++){
                    
                    if(arr[j]==random){
                        bandera = true;
                    }
                }
                
            }while(bandera);
            arr[i] = random;
        }
        
    }
    
    
    public static void imprimirArreglo(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("[ "+arr[i]+" ]");
        }
        System.out.println("");
    }
    
    public static void ordenar(int[] arr){
        int contador =0;
        for(int i =0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                  int aux = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = aux;
                  contador++;
                }
            }
        }
        System.out.println(contador);
    }
    
    
    public static int contarLetras(String[] arr, char letra){
        int contador =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)==letra){
                    contador++;
                }
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
       int[] arreglo = new int[15];
        imprimirArreglo(arreglo);
        llenarArregloSinRepetir(arreglo, 100);
        imprimirArreglo(arreglo);
        ordenar(arreglo);
        imprimirArreglo(arreglo);
    }
}
