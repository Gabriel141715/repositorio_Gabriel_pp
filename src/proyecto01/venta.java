
package proyecto01;
import java.util.Scanner;

public class venta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del vendedor
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombre = scanner.nextLine();

        // Solicitar el sueldo mensual
        System.out.print("Ingrese el sueldo mensual del vendedor: ");
        double sueldoMensual = scanner.nextDouble();

        // Solicitar las tres ventas
        System.out.print("Ingrese la venta 1: ");
        double venta1 = scanner.nextDouble();
        System.out.print("Ingrese la venta 2: ");
        double venta2 = scanner.nextDouble();
        System.out.print("Ingrese la venta 3: ");
        double venta3 = scanner.nextDouble();

        // Calcular la comisión
        double comision = (venta1 + venta2 + venta3) * 0.10;

        // Calcular el pago total
        double pagoTotal = sueldoMensual + comision;

        // Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre del vendedor: " + nombre);
        System.out.println("Sueldo mensual: " + sueldoMensual);
        System.out.println("Comision: " + comision);
        System.out.println("Pago total a fin de mes: " + pagoTotal);

        // Cerrar el scanner
        scanner.close();
    }
}
