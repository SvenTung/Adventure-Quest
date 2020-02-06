package Enemy.Boss;

import Enemy.Enemy;
import Class.Class;

public class GeneralGrevious extends Enemy {

    public GeneralGrevious(int HP, int attackValue){
        super(200, 10);
    }

    public void GeneralKenobi(Class character){
        character.loseHP(40);
    }


}
