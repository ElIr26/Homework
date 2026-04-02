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
        System.out.println(isSumBetween10And20(5, 7));
        System.out.println(isSumBetween10And20(1, 2));

        // ЗАДАНИЕ 6
        checkPositiveOrNegative(5);
        checkPositiveOrNegative(-3);
        checkPositiveOrNegative(0);

        // ЗАДАНИЕ 7
        System.out.println(isNegative(5));
        System.out.println(isNegative(-3));

        // ЗАДАНИЕ 8
        printStringMultipleTimes("Hello, QA!", 3);

        // ЗАДАНИЕ 9
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(1900));

        // ЗАДАНИЕ 10
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный: ");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();
        invertBinaryArray(binaryArray);
        System.out.print("Результат: ");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();

        // ЗАДАНИЕ 11
        int[] hundredArray = createArray1To100();
        System.out.print("Первые 10 элементов: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(hundredArray[i] + " ");
        }
        System.out.println();

        // ЗАДАНИЕ 12
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("До: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        multiplyLessThan6(numbers);
        System.out.print("После: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // ЗАДАНИЕ 13
        int[][] matrix = createDiagonalMatrix(5);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ЗАДАНИЕ 14
        int[] filled = fillArray(7, 42);
        for (int i = 0; i < filled.length; i++) {
            System.out.print(filled[i] + " ");
        }
        System.out.println();
    }

    // ЗАДАНИЕ 1
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // ЗАДАНИЕ 2
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // ЗАДАНИЕ 3
    public static void printColor() {
        int value = 75;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // ЗАДАНИЕ 4
    public static void compareNumbers() {
        int a = 8;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // ЗАДАНИЕ 5
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // ЗАДАНИЕ 6
    public static void checkPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println(number + " - положительное");
        } else {
            System.out.println(number + " - отрицательное");
        }
    }

    // ЗАДАНИЕ 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // ЗАДАНИЕ 8
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
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
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
