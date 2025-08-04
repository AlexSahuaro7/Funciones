public class contar_1_hasta_n_recursividad {
    //escribe una funcion recursiva que imprima los numeros del 1 hasta n
    public static void contar (int n) {
        if (n ==1) {
            System.out.println(1);

        }else {
            contar(n-1);
            System.out.println(n);
        }
    }
    public static void main (String[] args) {
        contar(5);
    }
}
