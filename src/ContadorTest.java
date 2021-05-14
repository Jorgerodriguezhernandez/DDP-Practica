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

    public void testvalorIncremento(){
        Contador c = new Contador(1);
        assertEquals(1,c.getValorIncremento());
    }
}
