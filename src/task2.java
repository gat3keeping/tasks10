import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму в долларах: ");
        double dollars = sc.nextDouble();
        double euro = dollars * 0.85;
        System.out.println("Сумма в евро: " + euro);
    }
}
