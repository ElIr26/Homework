class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Homework4 {
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка: надо 4 строки, у нас " + array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Ошибка: в строке " + i + " надо 4 столбца, а у нас " + array[i].length);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]:'" + array[i][j] + "' - это не число");
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(" \n");

        System.out.println("Правильный массив 4х4");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = sumArrayElements(correctArray);
            System.out.println("Результат: " + result + " (должно быть 136)");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Массив с ошибкой (буква 'X' в ячейке)");
        String[][] errorData = {
                {"1", "2", "3", "4"},
                {"5", "6", "X", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = sumArrayElements(errorData);
            System.out.println("Результат: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Поймали исключение: " + e.getMessage());
        }
        System.out.println();
        System.out.println("Массив с 3 строками (должно быть 4)");
        String[][] wrongSizeRows = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        try {
            int result = sumArrayElements(wrongSizeRows);
            System.out.println("Результат: " + result + "\n");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage() + "\n");
        }
        System.out.println();
        System.out.println("В первой строке 3 столбца (должно быть 4)");
        String[][] wrongSizeCols = {
                {"1", "2", "3"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = sumArrayElements(wrongSizeCols);
            System.out.println("Результат: " + result + "\n");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage() + "\n");
        }
        System.out.println();
        System.out.println("  ");
        System.out.println("Демострация ArrayIndexOutOfBoundsException:\n");

        try {
            int[] smallArray = new int[3];
            System.out.println("Массив из 3 элементов создали");
            System.out.println("Обращаемся к индексу 5");
            smallArray[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали исключение: " + e);
            System.out.println("Тип: ArrayIndexOutOfBoundsException");
            System.out.println("Ошибка: вышли за границы массива");
        }
        System.out.println("\nИтог");
    }
}
