package Class;

import Behaviours.IConsume;
import Behaviours.IHealth;
import Behaviours.IWield;
import Potion.Potion;
import Weapon.Weapon;

import java.util.ArrayList;

public abstract class Class implements IHealth, IWield, IConsume{

    ArrayList<Weapon> weapons;
    ArrayList<Potion> potions;

    int HP;


    public Class(ArrayList<Weapon> weapons, ArrayList<Potion> potions, int HP){
        this.weapons = weapons;
        this.potions = potions;
        this.HP = HP;
    }

    public void attack(){}

    public void healDamage(){}

    public void takeDamage(){}

}
