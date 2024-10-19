package output;

import model.Piloto;

import java.util.ArrayList;

public interface IPersistencia {

    public void guardarPiloto(Piloto pilotoNuevo);

    public ArrayList<Piloto> devolverPilotosRegistrados();
}
