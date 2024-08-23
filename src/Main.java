//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca una cadena de texto: ");
        String lectTeclado = scanner.nextLine();

        try {
            char resultado = CaracterEn.caracterEn(lectTeclado, 7);
            System.out.println("El caracter en la posicion 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe.");
        }
    }
}