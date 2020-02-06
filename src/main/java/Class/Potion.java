package Class;

public enum Potion {
    FIREPOTION(10),
    HEALINGPOTION(30),
    MANAPOTION(50);

    private final int value;

    Potion(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
