package Class;

import Behaviours.IConsume;
import Behaviours.IRage;

import java.util.ArrayList;

public class Barbarian extends Class implements IRage, IConsume {

    private ArrayList<Potion> potions;
    private Weapon equippedWeapon;
    private int HP;
    private int rage;

    Barbarian(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 150);
        this.rage = 0;
    }

    public void increaseRage(int value){
        this.rage += value;
        if (this.rage > 100){
            this.rage = 100;
        }
    }

    public void resetRage(){
        this.rage = 0;
    }

    public void healHP(int value){
        this.HP += value;
        if (this.HP > 150){
            this.HP = 150;
        }
    }
}
