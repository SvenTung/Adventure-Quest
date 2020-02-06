package Class;

import Behaviours.ICast;
import Behaviours.IConsume;
import Behaviours.IEnemy;

import java.util.ArrayList;

public class Cleric extends Class implements ICast, IConsume{

    private ArrayList<Potion> potions;
    private Weapon equippedWeapon;
    private int HP;
    private int mana;
    private String classID;

    Cleric(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 200);
        this.mana = 100;
        this.classID = "cleric";
    }

    public int attack(Weapon weapon) {
        return weapon.getDamage();
    }

    public void healHP(int value){
        this.HP += value;
        if (this.HP > 200){
            this.HP = 200;
        }
    }

    public void gainMana(int value){
        this.mana += value;
    }

    public void useMana(int value){
        this.mana -= value;
    }

    public void drinkManaPotion(Potion potion){
        this.gainMana(Potion.MANAPOTION.getValue());
    }

}
