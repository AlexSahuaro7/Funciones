import java.util.Scanner;
// diseñar una funcion eco() a la que se le pasa como parametro un numero n, y muestra por pantalla n veces
public class funcion_eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("introduce un numero: ");
        numero = sc.nextInt();
        System.out.println("---antes de llamar a la funcion--");
        eco (numero);
        System.out.println("---despues de llamar a la funcion--");
    }
    public static void eco(int numero){
        for (int i=1; i<=numero; i++){
            System.out.println("eco...");
        }
    }

}
// diseñar una funcion eco() a la que se le pasa como parametro un numero n, y muestra por pantalla n veces
//Devolver = calcular un valor y enviarlo de vuelta al que llamó la función.
//
//return es la palabra clave que se usa para devolver un valor.
//
//Si una función no devuelve nada, se escribe void.