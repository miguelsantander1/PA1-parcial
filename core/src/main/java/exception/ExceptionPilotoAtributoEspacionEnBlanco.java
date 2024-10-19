package exception;

public class ExceptionPilotoAtributoEspacionEnBlanco extends RuntimeException {
    public ExceptionPilotoAtributoEspacionEnBlanco() {
        super("Ninguno de los atributos del piloto cadenas en blanco");
    }
}
