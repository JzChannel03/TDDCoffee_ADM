import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAzucarero {

    Azucarero azuquero;

    @Before
    public void setUp(){
        azuquero = new Azucarero(10);
    }

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzuquero() {
        boolean resultado = azuquero.hasAzucar(5);

        assertEquals(true, resultado);

        resultado = azuquero.hasAzucar(10);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero() () {
        boolean resultado = azuquero.hasAzucar(15);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzuquero() {
        azuquero.giveAzucar(5);

        assertEquals(5, azuquero.getCantidadAzucar());

        azuquero.giveAzucar(2);

        assertEquals(3, azuquero.getCantidadAzucar());
    }
}
