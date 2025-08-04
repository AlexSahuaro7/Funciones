public class recursividad_contar_1_hasta_n {
    public static void contar (int actual, int n){
        if (actual>n){
            return; // se detiene la recursion
        }else {
            System.out.println(actual);
            contar(actual+1,n);
        }
    }
    public static void main (String[] args) {
        contar(1,5);
    }
}
