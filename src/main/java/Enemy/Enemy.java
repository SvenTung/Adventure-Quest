package Enemy;

import Behaviours.IEnemy;
import Behaviours.IHealth;

public class Enemy implements IHealth, IEnemy {

    private int HP;

    public Enemy(int HP){
        this.HP = HP;
    }

    public void attack();

    @Override
    public void healHP(int value) {

    }

    @Override
    public void loseHP(int value) {
        this.HP -= value;
    }
}
