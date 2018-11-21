import Behaviours.IDamage;

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }


    public void attack(IDamage idamage) {
        idamage.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        int health = this.getHealthValue();
        this.setHealthValue(health - damage);
    }
}
