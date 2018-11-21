import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ApacheTest {

    Apache apache;
    Godzilla godzilla;

    @Before
    public void setup(){
        apache = new Apache("Helicopter", 100, 80);
        godzilla = new Godzilla("Godzilla", 100, 80);
    }

    @Test
    public void hasType(){
        assertEquals("Helicopter", apache.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, apache.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(80, apache.getAttackValue());
    }

    @Test
    public void canSetAttackValue(){
        apache.setAttackValue(90);
        assertEquals(90, apache.getAttackValue());
    }

    @Test
    public void canAttack(){
        apache.attack(godzilla);
        assertEquals(20, godzilla.getHealthValue());
    }
}
