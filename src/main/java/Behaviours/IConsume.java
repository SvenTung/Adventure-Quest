package Behaviours;

import Class.Potion;
import Enemy.Enemy;

public interface IConsume {

    void drinkPotion(Potion potion, Class character);

    void useFirePotion(IEnemy enemy);

    void pickUpPotion(Potion potion);

}
