package Enemy.Boss;

import Enemy.Enemy;
import Class.Class;

public class Dracula extends Enemy {

    public Dracula(int HP, int attackValue){
        super(150, 8);
    }

    public void bloodThirst(Class character){
        character.loseHP(getAttackValue());
        healHP(getAttackValue());
    }



}
