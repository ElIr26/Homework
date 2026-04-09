public class Homework2 {

// Задание 1: Класс товара
    static class Product {
    String name;
    String productionDate;
    String manufacturer;
    String country;
    double price;
    boolean isReserved;
    // Конструктор
    public Product(String name, String productionDate, String manufacturer, String country, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;

        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
        this.isReserved = isReserved;
    }

    // Метод
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования покупателем: " + isReserved);
        }
    }

// Задание 2
    /*Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone XR", "10.10.2020", "Apple", "USA", 5000, false);
        productsArray[2] = new Product("Nokia 3310", "01.01.2025", "Nokia", "Finland", 2000, false);
        productsArray[3] = new Product("Xiaomi 23", "12.12.2024", "Xiaomi", "China", 5000, true);
        productsArray[4] = new Product("Яндекс Про", "10,10,2025", "Яндекс", "Россия", 2000, true);
     */

// Задание 3
    //Внутренний класс
static class Park {
    static class Attraction {
        String name;
        String workingHours;
        double price;

        //Конструктор
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;

            if (price < 0) {
                this.price = 0;
            } else {
                this.price = price;
                }
            }
        }
    }
}
