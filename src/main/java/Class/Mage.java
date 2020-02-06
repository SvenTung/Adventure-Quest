package Class;

import Behaviours.ICast;
import Behaviours.IConsume;

import java.util.ArrayList;

public class Mage extends Class implements ICast, IConsume{

    private ArrayList<Potion> potions;
    private Weapon equippedWeapon;
    private int HP;
    private int mana;

    Mage(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 100);
        this.mana = 150;
    }

    public void healHP(int value){
        this.HP += value;
        if (this.HP > 100){
            this.HP = 100;
        }
    }

    public void gainMana(int value){
        this.mana += value;
        if (this.mana > 150){
            this.mana = 150;
        }
    }

    public void useMana(int value){
        this.mana -= value;
    }

    public void drinkManaPotion(Potion potion){
        this.gainMana(Potion.MANAPOTION.getValue());
    }
}