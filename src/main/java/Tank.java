import Behaviours.IDamage;

public class Tank extends Vehicle {

    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

//    attacks something that is damageable and attacks it with the attack value given
    public void attack(IDamage idamage) {
        idamage.takeDamage(this.getAttackValue());
    }

//    should probably add the attack & takeDamage methods to the abstract classes...
    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        this.setHealthValue(healthValue - damage);
    }
}
