package animals;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;
    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        catCount++;
    }
    public void  eat(Bowl bowl, int amount) {
        if (amount <= 0) {
            System.out.println(name + " не может съесть " + amount + " еды ");
            return;
        }
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " покушала " + amount + " еды. Теперь сыта ");
        } else {
            System.out.println(name + " не стала есть - в миске мало еды (нужно " + amount + " доступно " + bowl.getFoodAmount() + ")");
        }
    }
    public  boolean isFull() {
        return isFull;
    }
    public static int getCatCount() {
        return catCount;
    }
}
