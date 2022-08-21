import CoffeeSrc.Azucarero;
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

        assertTrue(resultado);

        resultado = azuquero.hasAzucar(10);

        assertTrue(resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzuquero() {
        boolean resultado = azuquero.hasAzucar(15);

        assertFalse(resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzuquero() {
        azuquero.giveAzucar(5);

        assertEquals(5, azuquero.getCantidadDeAzucar());

        azuquero.giveAzucar(2);

        assertEquals(3, azuquero.getCantidadDeAzucar());
    }
}
