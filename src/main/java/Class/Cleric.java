package Class;

import Behaviours.ICast;
import Behaviours.IConsume;
import Behaviours.IHealth;

import java.util.ArrayList;

public class Cleric extends Class implements ICast, IConsume{

    private int HP;
    private int mana;

    public Cleric(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 200);
        this.mana = 100;
    }

    public void healHP(int value){
        this.HP += value;
        if (this.HP > 200){
            this.HP = 200;
        }
    }

    public int getMana() {
        return mana;
    }

    public void gainMana(int value){
        this.mana += value;
        if (this.mana > 100){
            this.mana = 100;
        }
    }

    public void useMana(int value){
        this.mana -= value;
    }

    public void drinkManaPotion(Potion potion){
        this.gainMana(Potion.MANAPOTION.getValue());
    }

    public void heal(IHealth character){
        if (this.mana > 25) {
            this.useMana(25);
            character.healHP((int)(Math.random() * 6) + 10);
        }
    }



}
