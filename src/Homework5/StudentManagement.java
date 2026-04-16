package Homework5;
import java.util.*;

public class StudentManagement {
    public static void removeLowPerfomingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
                System.out.println("Удалён студент: " + student.getName() + " (средний балл: " + student.getAverageGrade() + ")");
            }
        }
    }
    public static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Студент " + student.getName() + " переведён на " + student.getCourse() + " курс");
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\nСтуденты на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(" - " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println(" нет студентов на этом курсе");
        }
    }
}
