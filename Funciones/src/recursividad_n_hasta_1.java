import java.sql.Struct;

public class recursividad_n_hasta_1 {
    public static void contarreves (int n) {
        if (n == 1) {
            System.out.println(1);
        }else{
            System.out.println(n);
            contarreves(n-1);
        }
    }
    public static void main(String[] args){
        contarreves(5);
    }
}
