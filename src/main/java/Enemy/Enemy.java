package Enemy;

import Behaviours.IHealth;

public class Enemy implements IHealth{

    private int HP;

    public Enemy(int HP){
        this.HP = HP;
    }

    public void attack();

    public void healHP(int value) { this.HP += value; }

    public void loseHP(int value) {
        this.HP -= value;
    }
}
