public class suma_numeros_naturales {
    //crea una funcion recursividad que calcule la suma de los primeros n numeros.
    // suma(4) --> 1+2+3+4=10
    public static int suma (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + suma(n-1);
        }
    }
    public static void main (String[] args) {
        System.out.println("suma de los primeros 4 numeros: "+suma(4));
    }
}
