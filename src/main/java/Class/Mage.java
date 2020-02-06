package Class;

import Behaviours.ICast;
import Behaviours.IConsume;
import com.sun.crypto.provider.HmacMD5KeyGenerator;

import java.util.ArrayList;

public class Mage extends Class implements ICast, IConsume{

    private ArrayList<Potion> potions;
    private Weapon equippedWeapon;
    private int HP;
    private int mana;
    private String classID;

    Mage(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 100);
        this.classID = "Mage";
    }

    public void healHP(int value){
        this.HP += value;
        if (this.HP > 100){
            this.HP = 100;
        }
    }

    public void drinkManaPotion(Potion potion){
        this.gainMana(Potion.MANAPOTION.getValue());
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
}