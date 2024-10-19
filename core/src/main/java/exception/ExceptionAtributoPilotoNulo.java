package exception;

public class ExceptionAtributoPilotoNulo extends RuntimeException {
    public ExceptionAtributoPilotoNulo() {
        super("Ninguno de los atributos del piloto pueden ser nulos");
    }
}
