package exception;

public class ExceptionPilotoMismoDocumento extends RuntimeException {
    public ExceptionPilotoMismoDocumento() {
        super("No pueden existir dos o mas pilotos con el mismo documento");
    }
}
