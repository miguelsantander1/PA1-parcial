package exception;

public class ExcepcionPilotoMenorA18 extends RuntimeException {
    public ExcepcionPilotoMenorA18() {
        super("El piloto no puede ser menor de 18 años");
    }
}
