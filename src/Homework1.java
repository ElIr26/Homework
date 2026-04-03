import java.util.Arrays;

import static java.lang.System.*;

public class Homework1 {
    public static void main(String[] args) {

        // ЗАДАНИЕ 1
        printThreeWords();

        // ЗАДАНИЕ 2
        checkSumSign();

        // ЗАДАНИЕ 3
        printColor();

        // ЗАДАНИЕ 4
        compareNumbers();

        // ЗАДАНИЕ 5
        out.println(isSumBetween10And20(5, 7));
        out.println(isSumBetween10And20(1, 2));

        // ЗАДАНИЕ 6
        checkPositiveOrNegative(5);
        checkPositiveOrNegative(-3);
        checkPositiveOrNegative(0);

        // ЗАДАНИЕ 7
        out.println(isNegative(5));
        out.println(isNegative(-3));

        // ЗАДАНИЕ 8
        printStringMultipleTimes("Привет, Влад!", 3);

        // ЗАДАНИЕ 9
        out.println(isLeapYear(2020));
        out.println(isLeapYear(1900));

        // ЗАДАНИЕ 10
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        out.print("Исходный: ");
        for (int k : binaryArray) {
            out.print(k + " ");
        }
        out.println();
        invertBinaryArray(binaryArray);
        out.print("Результат: ");
        for (int k : binaryArray) {
            out.print(k + " ");
        }
        out.println();

        // ЗАДАНИЕ 11
        int[] hundredArray = createArray1To100();
        out.print("Первые 10 элементов: ");
        for (int i = 0; i < 10; i++) {
            out.print(hundredArray[i] + " ");
        }
        out.println();

        // ЗАДАНИЕ 12
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        out.print("До: ");
        for (int number : numbers) {
            out.print(number + " ");
        }
        out.println();
        multiplyLessThan6(numbers);
        out.print("После: ");
        for (int number : numbers) {
            out.print(number + " ");
        }
        out.println();

        // ЗАДАНИЕ 13
        int[][] matrix = createDiagonalMatrix(5);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                out.print(anInt + " ");
            }
            out.println();
        }

        // ЗАДАНИЕ 14
        int[] filled = fillArray(7, 42);
        for (int j : filled) {
            out.print(j + " ");
        }
        out.println();
    }

    // ЗАДАНИЕ 1
    public static void printThreeWords() {
        out.println("Orange\nBanana\nApple");
    }

    // ЗАДАНИЕ 2
    public static void checkSumSign() {
        out.println("Сумма положительная");
    }

    // ЗАДАНИЕ 3
    public static void printColor() {
        out.println("Желтый");
    }

    // ЗАДАНИЕ 4
    public static void compareNumbers() {
        out.println("a < b");
    }

    // ЗАДАНИЕ 5
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // ЗАДАНИЕ 6
    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            out.println(number + " - положительное");
        } else {
            out.println(number + " - отрицательное");
        }
    }

    // ЗАДАНИЕ 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // ЗАДАНИЕ 8
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            out.println(str);
        }
    }

    // ЗАДАНИЕ 9
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // ЗАДАНИЕ 10
    public static void invertBinaryArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    // ЗАДАНИЕ 11
    public static int[] createArray1To100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // ЗАДАНИЕ 12
    public static void multiplyLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    // ЗАДАНИЕ 13
    public static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    // ЗАДАНИЕ 14
    public static int[] fillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
