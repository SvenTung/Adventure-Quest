package Class;

import Behaviours.IConsume;
import Behaviours.IHealth;
import Enemy.Enemy;

import java.util.ArrayList;

public abstract class Class implements IHealth, IConsume{

    Weapon weapon;
    ArrayList<Potion> potions;
    int HP;


    public Class(Weapon weapon, ArrayList<Potion> potions, int HP){
        this.weapon = weapon;
        this.potions = potions;
        this.HP = HP;
    }

    public int attack(Weapon weapon){
        return weapon.getDamage();
    }

    public void healHP(int value){}

    public void loseHP(int value){
        this.HP -= value;
    }

    public void drinkHealingPotion(Potion potion){
        this.healHP(Potion.HEALINGPOTION.getValue());
    }

    public void useFirePotion(Enemy enemy) {
        enemy.loseHP(Potion.FIREPOTION.getValue());
    }

    public void pickUpPotion(Potion potion) {
        this.potions.add(potion);
    }
}
