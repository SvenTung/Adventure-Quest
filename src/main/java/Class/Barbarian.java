package Class;

import Behaviours.IRage;
import Potion.Potion;
import Weapon.Weapon;

import java.util.ArrayList;

public class Barbarian extends Class implements IRage {


    ArrayList<Potion> potions;
    Weapon equippedWeapon;
    int HP;
    int rage;

    Barbarian(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 150);
        this.rage = 0;
    }

    public void attack() {

    }



    public void increaseRage(){
        this.rage *
    }




}
