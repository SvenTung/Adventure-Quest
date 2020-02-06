import Behaviours.IHealth;
import Enemy.Enemy;
import Class.*;

import java.util.Scanner;

public class UI {

    public void welcomePlayer(){
        System.out.println("Welcome to Adventure Quest!");
    }

    public String chooseBarbarianWeapon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose either a greataxe or a meatgrinder for your barbarian:");
        String weapon = sc.nextLine();
        return weapon;
    }

    public String chooseClericWeapon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose either a Mace or a Censer for your cleric:");
        String weapon = sc.nextLine();
        return weapon;
    }

    public String chooseMageWeapon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose either a staff or a spellbook for your mage:");
        String weapon = sc.nextLine();
        return weapon;
    }

    public void questStart(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The king has hired you to clear out a cave. Rumour has it that a cyborg has been spotted alongside many minions taking refuge in the cave.");
        System.out.println("The king noticed your great turn based strategy prowess and made you the leader of a party consisting of a barbarian, cleric and a mage to complete this task.");
        System.out.println("Press enter to continue.");
        sc.nextLine();
    }

    public void enterDungeon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You enter the cave system, noting the footprints on the ground. Something not of this world has entered the cave recently.");
        sc.nextLine();
    }

    public void firstTurn(){
        System.out.println("A wild General Grevious appears. Catching your party by surprise he attempts to slash at the barbarian with his lightsaber. Your barbarian quickly dives out of the way.");
        System.out.println("Your party quickly recovers and the battle begins.");
    }

    public String barbarianTurn(Barbarian barbarian){
        Scanner sc = new Scanner(System.in);
        System.out.println("It is the barbarian's turn. He has " + getHP(barbarian) + " hitpoints left and " + barbarian.getRage() + " rage.");
        System.out.println("He can only attack for now.");
        String choice = sc.nextLine();
        return choice;
    }

    public void barbarianRage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("It is the barbarian's turn. He rages!");
        sc.nextLine();
        System.out.println("He enters a wild frenzy and begins a reckless assault on Grevious.");
        sc.nextLine();
        System.out.println("General Grevious manages to defend a few strikes from the barbarian but is slowing down");
        sc.nextLine();
        System.out.println("General Grevious desperately attempts a hail mary strike aimed at the barbarian's head");
        sc.nextLine();
        System.out.println("The barbarian parries Grevious' last strike and beheads General Grevious");
        sc.nextLine();
    }

    public void barbarianAttacks(){
        System.out.println("The barbarian swings his meatgrinder at General Grevious' head.");
    }

    public void ggTakesDamage(int value){
        System.out.println("General Grevious screams in rage. He takes " + value + " damage.");
    }

    public String clericTurn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("It's the cleric's turn. He can attack or he can heal all.");
        String choice = sc.nextLine();
        return choice;
    }

    public void clericAttacks(){
        System.out.println("The cleric swings his mace at General Grevious.");
    }

    public void heals(int value){
        System.out.println("The cleric heals the party for " + value + " hitpoints.");
    }

    public String mageTurn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("It's the mage's turn. He can attack or he use fireball.");
        String choice = sc.nextLine();
        return choice;
    }

    public void mageAttacks(){
        System.out.println("The mage fires a bolt from his staff at General Grevious.");
    }

    public void mageFireball(){
        System.out.println("The mage conjures a fireball and throws it from his hand at General Grevious");
    }

    public void ggsTurn(){
        System.out.println("General Grevious takes his turn. He swipes wildly at the barbarian. Dealing 10 damage to the barbarian");
    }

    public void ggOPTurn(){
        System.out.println("General Grevious uses his OP ability 'lightsaber whirlwind' and deals 10x4 damage to the barbarian");
    }

    private int getHP(IHealth character){
        return character.getHP();
    }
}
