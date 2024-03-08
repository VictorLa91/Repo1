package prueba;

import org.junit.jupiter.api.Test;

public class PruebaTest {

    @Test
    public void test01() {
        //setup
        System.out.println("Hola");
        Participante participante = new Participante();
        assertEquals("qwer", participante.crearParticipante());

    }

}
