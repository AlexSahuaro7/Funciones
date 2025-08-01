import java.util.Scanner;

public class funcion_area_volumen {


    public static void volumenareacilindro(double radio, double altura, int opcion) {
        double volumen, area;
        switch (opcion) {
            case 1 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen del cilindro es: " + volumen);
            }
            case 2 -> {
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El área del cilindro es: " + area);
            }
            default -> System.out.println("Opción incorrecta. Usa 1 para volumen o 2 para área.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();

        System.out.print("¿Qué quieres calcular? (1 = volumen, 2 = área): ");
        int opcion = sc.nextInt();

        volumenareacilindro(radio, altura, opcion);
    }
}
