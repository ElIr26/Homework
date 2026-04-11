package figures;

public interface Figure {
    double getPerimeter();
    double getArea();

    String getFillColor();
    void setFillColor(String color);
    String getBorderColor();
    void setBorderColor(String color);

    default void printIfo() {
        System.out.println("  " + this.getClass().getSimpleName() + "  ");
        System.out.printf("Периметр: %.2f\n", getPerimeter());
        System.out.printf("Площадь: %.2f\n", getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("   ");
    }
}
