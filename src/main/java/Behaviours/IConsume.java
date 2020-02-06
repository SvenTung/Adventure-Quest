package Behaviours;

import Class.Potion;
import Enemy.Enemy;

public interface IConsume {

    void drinkHealingPotion(Potion potion);

    void useFirePotion(Enemy enemy);

    void pickUpPotion(Potion potion);

}
