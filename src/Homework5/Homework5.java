package Homework5;
import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println(" Студенты \n");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Петрова Светлана", "Группа А", 1, Arrays.asList(5, 4, 5, 4, 5)));
        students.add(new Student("Боровкова Лена", "Группа Б", 2, Arrays.asList(2, 3, 2, 3, 2)));
        students.add(new Student("Васильева Ирина", "Группа А", 1, Arrays.asList(4, 4, 4, 5, 5)));
        students.add(new Student("Иванов Иван", "Группа Б", 3, Arrays.asList(3, 3, 3, 4 ,3)));
        students.add(new Student("Сидорова Ангелина", "Группа Б", 2, Arrays.asList(2, 2, 2, 2 ,2)));

        System.out.println("Все студенты:");
        for (Student s : students) {
            System.out.println(" " + s);
        }
        System.out.println("\n Удаление отстающих ");
        StudentManagement.removeLowPerfomingStudents(students);

        System.out.println("\n Перевод студентов ");
        StudentManagement.promoteStudents(students);

        System.out.println("\n Оставшиеся студенты ");
        for (Student s : students) {
            System.out.println(" " + s);
        }
        Set<Student> studentSet = new HashSet<>(students);
        StudentManagement.printStudents(studentSet, 2);
        StudentManagement.printStudents(studentSet, 3);
        StudentManagement.printStudents(studentSet, 4);

        System.out.println("\n Телефонный справочник \n");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+79090999999");
        phoneBook.add("Петров", "+79090999998");
        phoneBook.add("Иванов", "+79090999997");
        phoneBook.add("Сидоров", "+79090999996");
        phoneBook.add("Иванов", "+79090999995");

        phoneBook.printAll();

        System.out.println("\n Поиск по фамилии ");
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнова"));
    }
}
