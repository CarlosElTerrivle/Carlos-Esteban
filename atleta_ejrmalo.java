//Ejercicio  3.9: Un  atleta  de  lunes  a  sábados  corre  la  misma  ruta  y  
// cronometra los  tiempos  obtenidos, desarrolle  un  algoritmo  que  determine 
// el  tiempo  promedio que  el  atleta  se  demora  en  recorrer  la  ruta  en una semana cualquiera.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("cuantos metros corriste:");
        int metros = in.nextInt();
        System.out.println("a que velocidad:");
        int veloc = in.nextInt();
        int resul = metros / veloc;
        System.out.println("llegaste en " + resul + " segundos");

    }

}
