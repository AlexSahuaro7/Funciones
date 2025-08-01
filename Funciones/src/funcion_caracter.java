public class funcion_caracter {
    public static boolean esvocal(char c){
        boolean resultado; // true si es una vocal y false en caso contrario.
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {

            resultado = true;

        }else{
            resultado = false;
        }
        return resultado;
    }
    public static void main (String [] args) {
        System.out.println("la i es una vocal" +esvocal('i'));
        System.out.println("la e es una vocal" +esvocal('e'));
        System.out.println("la f es una vocal" +esvocal('f'));
    }
}
