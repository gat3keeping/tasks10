import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[][] array = {
                {14, 61, 22, 41},
                {51, 65, 73, 84},
                {95, 100, 114, 121},
                {123, 134, 115, 166},
                {175, 168, 197, 280}
        };
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Отсортированный массив: " + i + ": " + Arrays.toString(array[i]));
            System.out.println("Элемент " + i + " в массиве " + i + ": " + array[i][i]);
        }
    }
}
