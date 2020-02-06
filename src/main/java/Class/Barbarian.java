package Class;

import Behaviours.IConsume;
import Behaviours.IRage;
import Potion.Potion;
import Weapon.Weapon;

import java.util.ArrayList;

public class Barbarian extends Class implements IRage, IConsume {


    ArrayList<Potion> potions;
    Weapon equippedWeapon;
    int HP;
    int rage;
    private String classID;

    Barbarian(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 150);
        this.rage = 0;
        this.classID = "Barbarian";
    }

    public void attack() {

    }



    public void increaseRage(){
        this.rage *
    }

    public void loseHP(int value){
        this.HP -= value;
    }

    public void healHP(int value){
        if(this.HP == 150){
            return;
        }
        this.HP += value;
    }





}
