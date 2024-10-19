package input;

import java.time.LocalDateTime;
import java.util.UUID;

public interface IRegistrarPiloto {

    public UUID RegistrarPiloto(String nombre, String Documento, LocalDateTime fechaDeNacimiento) throws Exception;
}
