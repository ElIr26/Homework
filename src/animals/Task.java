package animals;

public class Task {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Cat anfisa = new Cat("Анфиса");
        Cat murka = new Cat("Мурка");

        System.out.println(" Собака Бобик ");
        System.out.println("(лимит: бег - 500 м, плавание - 10 м)\n");
        bobik.run(150);
        bobik.run(500);
        bobik.run(600);
        bobik.swim(5);
        bobik.swim(10);
        bobik.swim(15);

        System.out.println("\n Кошка Анфиса ");
        System.out.println("(Лимит: бег - 200 м, плавание - не умеет)\n");
        anfisa.run(50);
        anfisa.run(200);
        anfisa.run(250);
        anfisa.swim(5);
        anfisa.swim(1);

        System.out.println("\n Кошка Мурка ");
        System.out.println("(Лимит: бег - 200 м, плавание - не умеет)\n");
        murka.run(150);
        murka.run(199);
        murka.run(201);
        murka.swim(1);
        murka.swim(10);

        System.out.println("\n Подсчёт животных \n");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Из них собак: " + Dog.getDogCount());
        System.out.println("Из них кошек: " + Cat.getCatCount());

        System.out.println("\n Кормление \n");
        Bowl bowl = new Bowl(25);
        System.out.println(" Создана миска с " + bowl.getFoodAmount() + " единица еды \n");
        Cat[] cats = {anfisa, murka, new Cat("Василиса"), new Cat("Маруся"), new Cat("Бася")};

        System.out.println(" Кормление ");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
        System.out.println("\n Информация о сытости ");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - " + (cat.isFull() ? "Сыт" : "Голоден"));
        }
        System.out.println("\n Осталось еды в миске: " + bowl.getFoodAmount());
        System.out.println("\n Добавление еды в миску ");
        bowl.addFood(20);
        System.out.println(" В миске " + bowl.getFoodAmount() + " единица еды ");
        System.out.println("\n Докормить ");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }
        System.out.println("\n Итоговая информация ");
        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
        System.out.println("Из них собак: " + Dog.getDogCount());
        System.out.println("Из них котов: " + Cat.getCatCount());
        System.out.println("\n Сытые кошки ");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - " + (cat.isFull() ? "Сыт" : "Голоден"));
        }
        System.out.println("Еды в миске: " + bowl.getFoodAmount());
    }
}
