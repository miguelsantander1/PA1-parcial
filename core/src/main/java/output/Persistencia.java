package output;

import model.Piloto;

import java.util.ArrayList;

public class Persistencia implements IPersistencia{
    private ArrayList<Piloto> baseDeDatosDePilotos;

    public Persistencia(){
        baseDeDatosDePilotos = new ArrayList<Piloto>();
    }

    @Override
    public void guardarPiloto(Piloto pilotoNuevo) {
        baseDeDatosDePilotos.add(pilotoNuevo);
    }

    @Override
    public ArrayList<Piloto> devolverPilotosRegistrados() {
        return baseDeDatosDePilotos;
    }
}
