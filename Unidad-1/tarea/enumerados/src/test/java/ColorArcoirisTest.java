import es.ies.puerto.enumerado.ColorArcoiris;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorArcoirisTest {

    ColorArcoiris colorArcoiris;

    @BeforeEach
    public void beforeEach(){
    }
    @Test
    public void colorArcoirisRojo(){
        colorArcoiris= ColorArcoiris.ROJO;
        System.out.println(colorArcoiris);
        Assertions.assertEquals(ColorArcoiris.ROJO,colorArcoiris);
    }

    @Test
    public void colorArcoirisAñil(){
        colorArcoiris= ColorArcoiris.AÑIL;
        System.out.println(colorArcoiris);
        Assertions.assertEquals(ColorArcoiris.AÑIL,colorArcoiris);
    }
}
