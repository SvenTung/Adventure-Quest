package Class;

import Behaviours.IConsume;
import Behaviours.IEnemy;
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

    public int attack(Weapon equippedWeapon) {
        int damageValue = equippedWeapon.getDamage();
        return damageValue;
    }



    public void increaseRage(int incrementValue){
        this.rage *= incrementValue;
    }

    public void resetRage(){
        this.rage = 0;
    }

    public void healHP(int value){
        if(this.HP == 150){
            return;
        }
        this.HP += value;
    }

    public void useFirePotion(IEnemy enemy){

    }

    public void pickUpPotion(Potion potion){

    }





}
