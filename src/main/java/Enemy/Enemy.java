package Enemy;

import Behaviours.IHealth;
import Class.Class;

public class Enemy implements IHealth{

    private int HP;
    private int attackValue;

    public Enemy(int HP, int attackValue){
        this.HP = attackValue;
        this.attackValue = attackValue;
    }

    public void attack(Class character){
        character.loseHP(this.attackValue);
    }

    public void healHP(int value) { this.HP += value; }

    public int getHP() {
        return HP;
    }

    public void loseHP(int value) {
        this.HP -= value;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
