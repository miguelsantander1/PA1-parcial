package model;

import exception.ExcepcionPilotoMenorA18;
import exception.ExceptionAtributoPilotoNulo;
import exception.ExceptionPilotoAtributoEspacionEnBlanco;
import exception.ExceptionPilotoAtributoVacio;

import java.time.LocalDateTime;
import java.util.UUID;

public class Piloto {
    private UUID id;
    private String nombre;
    private String documento;
    private LocalDateTime fechaNacimiento;

    private Piloto(String nombre, String documento, LocalDateTime fechaNacimiento){
        id = UUID.randomUUID();
        this.nombre = nombre;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static Piloto Factory(String nombre, String documento, LocalDateTime fechaNacimiento) throws Exception{
        if (nombre==null || documento==null || fechaNacimiento==null)
            throw new ExceptionAtributoPilotoNulo();
        if (nombre.isBlank() || documento.isBlank())
            throw  new ExceptionPilotoAtributoEspacionEnBlanco();
        if (nombre.isEmpty() || documento.isEmpty())
            throw new ExceptionPilotoAtributoVacio();
        if (LocalDateTime.now().minusYears(18).isBefore(fechaNacimiento))
            throw new ExcepcionPilotoMenorA18();

        return (new Piloto(nombre, documento, fechaNacimiento));
    }

    public UUID getId() {
        return id;
    }

    public String getDocumento(){
        return documento;
    }
}
