import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Вы несовершеннолетний!");
        }
    }
}