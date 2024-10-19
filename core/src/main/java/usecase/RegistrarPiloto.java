package usecase;

import exception.ExceptionPilotoMismoDocumento;
import input.IRegistrarPiloto;
import model.Piloto;
import output.IPersistencia;

import java.time.LocalDateTime;
import java.util.UUID;

public class RegistrarPiloto implements IRegistrarPiloto {
    private IPersistencia persistencia;
    private BuscarPilotoPorDocumento buscarPilotoPorDocumento;

    public RegistrarPiloto(IPersistencia baseDeDatos){
        persistencia = baseDeDatos;
        buscarPilotoPorDocumento = new BuscarPilotoPorDocumento();
    }

    @Override
    public UUID RegistrarPiloto(String nombre, String Documento, LocalDateTime fechaDeNacimiento) throws Exception {
        Piloto pilotoNuevo = Piloto.Factory(nombre, Documento, fechaDeNacimiento);
        if (buscarPilotoPorDocumento.buscarPilotoPorDocumento(pilotoNuevo.getDocumento(),persistencia.devolverPilotosRegistrados())!= null)
            throw new ExceptionPilotoMismoDocumento();
        return pilotoNuevo.getId();
    }


}
