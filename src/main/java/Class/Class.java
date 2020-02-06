package Class;

import Behaviours.IConsume;
import Behaviours.IHealth;
import Behaviours.IWield;

import java.util.ArrayList;

public abstract class Class implements IHealth, IWield, IConsume{

    Weapon weapon;
    ArrayList<Potion> potions;
    int HP;


    public Class(Weapon weapon, ArrayList<Potion> potions, int HP){
        this.weapon = weapon;
        this.potions = potions;
        this.HP = HP;
    }

    public void attack(){}

    public void healDamage(){}

    public void takeDamage(){}

}
