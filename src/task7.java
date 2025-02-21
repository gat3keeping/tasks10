import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Введите число а: ");
            int a = in.nextInt();
            System.out.print("Введите число b ");
            int b = in.nextInt();
            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = in.next();

            switch (operation) {
                case "+":
                    System.out.println("Сумма равна: " + (a + b));
                    break;
                case "-":
                    System.out.println("Разность равна: " + (a - b));
                    break;
                case "*":
                    System.out.println("Произведение равно: " + (a * b));
                    break;
                case "/":
                    if (b == 0) {
                        System.out.print("Деление на 0 невозможно");
                    } else {
                        System.out.println("Деление равно: " + (a / b));
                    }
                    break;
                default:
                    System.out.println("Неверная операция.");
            }
            System.out.println("Хотите продолжить? (да/нет)");
            String choise = in.next();
            if (!choise.equalsIgnoreCase("да")) {
                continueCalculation = false;
            }
        }
    }
}