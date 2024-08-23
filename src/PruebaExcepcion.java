import java.util.Scanner;

public class PruebaExcepcion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduzca un numero: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
               throw new NumeroNegativoExcepcion("Error: No se puede calcular la raiz cuadrada de un numero negativo.");
            }
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
        } catch (NumeroNegativoExcepcion e) {
           System.out.println(e.getMessage());
        } catch (Exception e) {
           System.out.println("Ocurrio un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}