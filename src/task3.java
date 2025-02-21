public class task3 {
    public static void main(String[] args) {
        int [] numbers = {3,7,2,9,5};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
