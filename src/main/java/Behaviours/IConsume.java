package Behaviours;

import Class.Potion;
import Enemy.Enemy;

public interface IConsume {

    void drinkPotion(Potion potion);

    void useFirePotion(IEnemy enemy);

    void pickUpPotion(Potion potion);

}
