import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TankTest {

    Tank tank;
    Mothra mothra;

    @Before
    public void setup(){
        tank = new Tank("Ground", 100, 80);
        mothra = new Mothra("Mothra", 100, 60);
    }

    @Test
    public void hasType(){
        assertEquals("Ground", tank.getType());
    }

    @Test
    public void canSetType(){
        tank.setType("Big Tank");
        assertEquals("Big Tank", tank.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, tank.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(80, tank.getAttackValue());
    }

    @Test
    public void canSetAttackValue(){
        tank.setAttackValue(75);
        assertEquals(75, tank.getAttackValue());
    }

    @Test
    public void canAttack(){
        tank.attack(mothra);
        assertEquals(20, mothra.getHealthValue());
    }
}
