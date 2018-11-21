import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void setup(){
        godzilla = new Godzilla("Godzilla", 100, 80);
        tank = new Tank("Ground", 100, 60);
    }

    @Test
    public void hasName(){
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void canSetName() {
        godzilla.setName("Gojira");
        assertEquals("Gojira", godzilla.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(80, godzilla.getAttackValue());
    }

    @Test
    public void canSetAttackValue(){
        godzilla.setAttackValue(70);
        assertEquals(70, godzilla.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Roaaarrr!!", godzilla.roar());
    }

    @Test
    public void canAttack(){
        godzilla.attack(tank);
        assertEquals(20, tank.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I am walking", godzilla.move());
    }


}
