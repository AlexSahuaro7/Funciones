import java.util.Scanner;

public class funcion_rango_numeros {
    //condición ? valor_si_verdadero : valor_si_falso;
    public static void mostrar(int a, int b) {
        int mayor = (a > b) ? a : b;
        //Si a > b, entonces mayor = a.
        //Si no, mayor = b.
        int menor = (a < b) ? a : b;
        //Si a < b, entonces menor = a.
        //Si no, menor = b.
        System.out.println("el numero mayor es: " + mayor);
        System.out.println("el numero menor es: " + menor);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero 1: ");
        int a = sc.nextInt();
        System.out.println("introduce un numero 2: ");
        int b = sc.nextInt();
        mostrar(a,b);
    }
}
