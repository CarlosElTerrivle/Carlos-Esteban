 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sueldobase = 0, pagohorasex, isapre, descisap = 0, afp, descafp = 0, grado, sueldototal = 0, horasext;

        System.out.println("ingrese grado del 1 al 3: ");
        grado = in.nextDouble();
        while (grado <= 0 || grado > 3) {
            System.out.println("ingrese grado correcto.");
            grado = in.nextDouble();

        }
        if (grado == 1) {
            sueldobase = 450000;
        }
        if (grado == 2) {
            sueldobase = 550000;

        }
        if (grado == 3) {
            sueldobase = 700000;

        }
        
        System.out.println("ingrese horas extras: ");
        horasext = in.nextDouble();
        if (horasext == 1 && horasext == 2 && horasext == 3) {
            pagohorasex = horasext * 2000;
        }
        if (horasext == 4 && horasext == 5 && horasext == 6 && horasext == 7) {
            pagohorasex = horasext * 3000;

        }
        if (horasext > 7) {
            pagohorasex = horasext * 3500;
        }
        System.out.println("ingrese numero de isapre: ");
        System.out.println("1.- colmena");
        System.out.println("2.-Ban Medica ");
        System.out.println("3.-Vida 3 ");
        System.out.println("4.-Fonasa ");
        System.out.println("            ");
        isapre = in.nextDouble();
        while (isapre <= 0 || isapre > 4) {
            System.out.println("ingrese numero valido.");
            isapre = in.nextDouble();
        }
        if (isapre == 1) {
            descisap = sueldobase * 0.065;

        }
        if (isapre == 2) {
            descisap = sueldobase * 0.073;
        }
        if (isapre == 3) {
            descisap = sueldobase * 0.07;
        }
        if (isapre == 4) {
            descisap = sueldobase * 0.07;
        }
        
        System.out.println("ingrese numero de afp: ");
        System.out.println("1.- Bansander");
        System.out.println("2.- Geometrica S.A.");
        System.out.println("3.-Cuprum ");
        System.out.println("4.-Provida ");
        System.out.println("                ");
        afp = in.nextDouble();
         while (afp <= 0 || afp > 4) {
            System.out.println("ingrese numero correcto.");
            afp = in.nextDouble();

        }
        if (afp == 1) {
            descafp = sueldobase * 0.12;

        }
        if (afp == 2) {
            descafp = sueldobase * 0.134;
        }
        if (afp == 3) {
            descafp = sueldobase * 0.123;
        }
        if (afp == 4) {
            descafp = sueldobase * 0.129;
        }
       
        sueldototal = sueldobase + horasext - (descisap + descafp);
        int sueldoreal = (int) sueldototal;
        System.out.println("tu sueldo total es: " + sueldoreal);

    }
