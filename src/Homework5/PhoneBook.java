package Homework5;
import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
        System.out.println("Добавлен: " + lastName + " -> " + phoneNumber);
    }
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
    public void printAll() {
        System.out.println("\nТелефонный справочник:");
        if (phoneBook.isEmpty()) {
            System.out.println(" Справочник пуст");
            return;
        }
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(" " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
