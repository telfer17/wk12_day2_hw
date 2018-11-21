import Behaviours.IDamage;

public class Tank extends Vehicle {

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(IDamage idamage) {
        idamage.takeDamage(this.getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        this.setHealthValue( healthValue - damage);
    }
}
