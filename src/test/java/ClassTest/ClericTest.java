package ClassTest;
import Class.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ClericTest {
    Cleric cleric;
    ArrayList<Potion> potions;

    @Before
    public void before(){
        potions = new ArrayList<>();
        potions.add(Potion.HEALINGPOTION);
        cleric = new Cleric(Weapon.MACE, potions);
    }

    @Test
    public void canHealSelf(){
        cleric.loseHP(20);
        cleric.heal(cleric);
    }

}
