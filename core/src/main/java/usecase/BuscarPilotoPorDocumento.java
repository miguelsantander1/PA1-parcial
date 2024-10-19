package usecase;

import input.IBuscarPilotoPorDocumento;
import model.Piloto;

import java.util.ArrayList;

public class BuscarPilotoPorDocumento implements IBuscarPilotoPorDocumento {

    @Override
    public Piloto buscarPilotoPorDocumento(String documento, ArrayList<Piloto> pilotosRegistrados) {
        for(Piloto pilotoRegistrado :pilotosRegistrados){
            if(pilotoRegistrado.getDocumento().equalsIgnoreCase(documento))
                return pilotoRegistrado;
        }
        return null;
    }
}
