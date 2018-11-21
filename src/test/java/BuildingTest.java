import org.junit.Before;

public class BuildingTest {

    Building building;
    Godzilla godzilla;

    @Before
    public void setup(){
        building = new Building();
        godzilla = new Godzilla("Godzilla", 100, 80);
    }
}
