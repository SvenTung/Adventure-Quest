package Class;

import java.util.ArrayList;

public class Cleric extends Class{

    ArrayList<Potion> potions;
    Weapon equippedWeapon;
    int HP;

    Cleric(Weapon equippedWeapon, ArrayList<Potion> potions){
        super(equippedWeapon, potions, 200);
    }

    public void attack() {

    }
}
