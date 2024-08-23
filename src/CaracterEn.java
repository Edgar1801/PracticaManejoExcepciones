public class CaracterEn{
   public static char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("La posicion " + posicion + " está fuera del rango valido (0 a " + (cadena.length() - 1) + ").");
        }
    }

    public static void main(String[] args) {
        try {
            String ejemplo = "Hola profe, buenas tardes";
            int posicion = 5;
            char resultado = caracterEn(ejemplo, posicion);
            System.out.println("El caracter en la posicion " + posicion + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}