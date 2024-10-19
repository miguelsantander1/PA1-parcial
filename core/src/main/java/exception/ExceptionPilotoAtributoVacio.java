package exception;

public class ExceptionPilotoAtributoVacio extends RuntimeException {
    public ExceptionPilotoAtributoVacio() {
        super("Ninguno de los atributos del piloto pueden estar vacios");
    }
}
