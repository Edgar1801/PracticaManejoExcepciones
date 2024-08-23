public class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        super("Error: El numero es negativo.");
    }
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}