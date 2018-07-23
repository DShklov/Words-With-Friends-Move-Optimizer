package Letters;

public class Letter {
    String name;
    int value;
    int amount;


    public Letter(String name, int value, int amount){
       this.name = name;
       this.value = value;
       this.amount = amount;
    }

    public static int getAmount(Letter l){
        return l.amount;
    }

    public static int getValue(Letter l){
        return l.value;
    }
}
