public class funcion_par_impar {
    public static void parimpar (int numero){
        if(numero % 2 == 0) {
            System.out.println("el numero es par");

        }else {
            System.out.println("el numero es impar");
        }
    }
    public static void main (String[] args) {
        int numero = 7;
        parimpar(numero);
        parimpar(numero);
    }
}
