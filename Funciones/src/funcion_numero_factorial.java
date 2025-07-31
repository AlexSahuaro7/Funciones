public class funcion_numero_factorial {
    //Crea una función factorial() que reciba un número y devuelva su factorial.
    public static int factorial(int numero) {
        int resultado = 1;
        int i;
        for (i=1; i <= numero; i++) {
            resultado *= i; //resultado = resultado * i;

        }
        return resultado;
    }
    public static void main(String[] args){
        System.out.println("el numero factorial es "+factorial(5));

    }
}
