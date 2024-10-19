package input;

import model.Piloto;

import java.util.ArrayList;

public interface IBuscarPilotoPorDocumento {
    public Piloto buscarPilotoPorDocumento(String documento, ArrayList<Piloto> pilotosRegistrados);
}
