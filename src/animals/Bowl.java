package animals;

public class Bowl {
    private int foodAmount;
    public Bowl(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
            System.out.println("Предупреждение: количество еды не может быть отрицательным");
        } else {
            this.foodAmount = initialFood;
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println(" Добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
        } else {
            System.out.println(" Ошибка: нельзя добавить " + amount + " еды (количество должно быть положительным) ");
        }
    }
    public boolean decreaseFood(int amount) {
        if (amount > 0 && foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }
    public  int getFoodAmount() {
        return foodAmount;
    }
}
