import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MothraTest {

    Mothra mothra;
    Apache apache;

    @Before
    public void setup(){
        mothra = new Mothra("Mothra", 100, 60);
        apache = new Apache("Helicopter", 100, 80);
    }

    @Test
    public void hasName(){
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void canSetName() {
        mothra.setName("Big Lizard");
        assertEquals("Big Lizard", mothra.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, mothra.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(60, mothra.getAttackValue());
    }

    @Test
    public void canSetAttackValue(){
        mothra.setAttackValue(80);
        assertEquals(80, mothra.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Roaaarrr!!", mothra.roar());
    }

    @Test
    public void canAttack(){
        mothra.attack(apache);
        assertEquals(40, apache.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I am flying", mothra.move());
    }

}
