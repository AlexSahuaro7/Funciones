import java.util.Scanner;

public class funcion_maximo_dos_numeros {
    public static int mostrar (int a, int b) {
        int max;
        if (a > b) {
            max =a;

        }else {
            max =b;
        }
        return (max);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero: ");
        int a = sc.nextInt();
        System.out.println("introduce un segundo numero");
        int b = sc.nextInt();
        System.out.println("el numero mayor es: "+mostrar(a,b));

    }
}
