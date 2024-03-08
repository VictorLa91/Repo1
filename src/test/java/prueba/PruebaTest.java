package prueba;

import org.example.Participante;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {

    @Test
    public void test01() {
        //setup
        System.out.println("Hola");
        Participante participante = new Participante();
        assertEquals("qwer", participante.crearParticipante());

    }

}
