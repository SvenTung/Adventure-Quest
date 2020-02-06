package Class;

import Behaviours.ICast;
import Behaviours.IConsume;

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

    public void loseHP(int value){
        this.HP -= value;
    }

    public void gainMana(int value){
        this.mana += value;
    }

    public void useMana(int value){
        this.mana -= value;
    }

    public void usePotion(Potion potion, Class character){
        if (potion == Potion.HEALINGPOTION){
            character.healHP(Potion.HEALINGPOTION.getValue());
        } else {
            if (character.getClassID != "barbarian"){
                character.gainMana(Potion.MANAPOTION.getValue());
            }
        }
    }
}
