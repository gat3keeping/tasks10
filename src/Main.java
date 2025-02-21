import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга: " + area);
    }
}