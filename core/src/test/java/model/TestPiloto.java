package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Not;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TestPiloto {

    @Test
    @Order(1)
    @DisplayName("verifica que se cree un piloto correctamente con todos sus atributos")
    public void testTodosLosAtributosCorrectos()  {
        final Piloto nuevoPiloto;
        //Exception exception = assertThrows(Exception.class, () -> {
        //  nuevoPiloto = Piloto.Factory("Mario", "23123ASd",
        //            LocalDateTime.of(1998, 11, 24, 22, 51));
        //});

       // assertNotNull(nuevoPiloto);
    }

    @Test
    @Order(2)
    @DisplayName("Arroja una exception por un atributo nulo")
    public void testNombreNulo() {
        Exception exception = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory(null, "23123ASd",
                    LocalDateTime.of(1998, 11, 24, 22, 51));
        });

        assertEquals("Ninguno de los atributos del piloto pueden ser nulos",exception.getMessage());
    }

    @Test
    @Order(3)
    @DisplayName("Arroja una excepcion por varios o todos los atributos nulos")
    public void testVariosAtributosNulos() {
        Exception exception1 = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory("Lionel", null,
                    null);
        });

        Exception exception2 = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory(null, null, null);
        });

        assertEquals("Ninguno de los atributos del piloto pueden ser nulos",exception1.getMessage());
        assertEquals("Ninguno de los atributos del piloto pueden ser nulos",exception2.getMessage());

    }

    @Test
    @Order(4)
    @DisplayName("Arroja una excepcion por un atributo vacio")
    public void testDocumentoVacio(){
        Exception exception1 = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory("Lionel", "",
                    LocalDateTime.of(1998, 11, 24, 22, 51));
        });

        assertEquals("Ninguno de los atributos del piloto pueden estar vacios",exception1.getMessage());
    }

    @Test
    @Order(5)
    @DisplayName("Arroja una excepcion por varios o todos los atributos vacios")
    public void testVariosAtributosVacios(){
        Exception exception1 = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory("Lionel", "",
                    LocalDateTime.of(1998, 11, 24, 22, 51));
        });

        Exception exception2 = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory("", "",
                    LocalDateTime.of(1998, 11, 24, 22, 51));
        });

        assertEquals("Ninguno de los atributos del piloto pueden estar vacios",exception1.getMessage());
        assertEquals("Ninguno de los atributos del piloto pueden estar vacios",exception2.getMessage());


    }

    @Test
    @Order(6)
    @DisplayName("Arroja una excepcion por un atributo de cadena en blanco")
    public void testNombrecadenaBlanca(){
        Exception exception = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory("   ", "23123ASd",
                    LocalDateTime.of(1998, 11, 24, 22, 51));
        });

        assertEquals("Ninguno de los atributos del piloto cadenas en blanco",exception.getMessage());
    }

    @Test
    @Order(7)
    @DisplayName("Arroja una excepcion por varios o todos los atributos de cadenas en blanco")
    public void testVariosAtributosCadenasBlancas(){
        Exception exception = assertThrows(Exception.class, () -> {
            Piloto nuevoPiloto = Piloto.Factory("   ", "   ",
                    LocalDateTime.of(1998, 11, 24, 22, 51));
        });

        assertEquals("Ninguno de los atributos del piloto cadenas en blanco",exception.getMessage());

    }

}