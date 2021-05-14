import static org.junit.Assert.*;
import org.junit.Test;

public class ContadorTest {
    @Test
    public void testCreacionObjet() {

        Contador calculo = new Contador(1,6,1);

    }


    @Test
    public void testvalorInicial(){
        Contador c = new Contador(10);
        assertEquals(0,c.get_valorInicial());
    }

    @Test
    public void testvalorIncremento(){
        Contador c = new Contador(0,1,3);
        assertTrue(c.incremento());
    }

    @Test
    public void testReseteoAInicial(){
        Contador c = new Contador(0,1,3);
        assertEquals(0,c.get_valorInicial());
    }
}


