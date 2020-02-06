package Class;

public enum Weapon {
    GREATAXE(13),
    MEATGRINDER(15),
    MACE(8),
    CENSER(4),
    STAFF(10),
    SPELLBOOK(8);

    private final int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() { return this.damage; }
}