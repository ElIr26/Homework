package animals;

public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected  static int animalCount = 0;
    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }
    public String getName() {
        return name;
    }
    public void run(int distance) {
        if (distance <= runLimit && runLimit > 0) {
            System.out.println(name + " пробежал " + distance + " максимум ");
        } else if (runLimit == 0) {
            System.out.println(name + " не умеет бегать ");
        } else {
            System.out.println(name + " не может пробежать " + distance + " максимум " + runLimit + " максимум ");
        }
    }
    public  void swim(int distance) {
    if (distance <= swimLimit && swimLimit > 0) {
        System.out.println(name + " проплыл " + distance + " максимум ");
    } else  if (swimLimit == 0) {
        System.out.println(name + " не умеет плавать ");
    } else {
        System.out.println(name + " не может проплыть " + distance + " максимум " + swimLimit + " максимум ");
    }
    }
    public static int getAnimalCount() {
    return animalCount;
    }
}

