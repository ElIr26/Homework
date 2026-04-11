package figures;

public class Task {
    public static void main(String[] args) {
        System.out.println(" Геометрические фигуры ");
        System.out.println();

        Circle circle = new Circle(5.0, "жёлтый", "красный");
        Rectangle rectangle = new Rectangle(4.0, 7.0, "синий", "зелёный");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "чёрный", "фиолетовый");

        circle.printIfo();
        rectangle.printIfo();
        triangle.printIfo();

        System.out.println();
        System.out.println(" Изменение цветов ");
        System.out.println("Было: Круг - заливка " + circle.getFillColor() + " граница " + circle.getBorderColor());
        circle.setFillColor("голубой");
        circle.setBorderColor("розовый");
        System.out.println("Стало: круг - заливка " + circle.getFillColor() + " граница " + circle.getBorderColor());
    }
}
