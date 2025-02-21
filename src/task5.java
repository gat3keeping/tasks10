import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сроку: ");
        String input = sc.nextLine();
        String result = input.replaceAll("\\s", "");
        System.out.println("Строка без пробелов: " + result);
    }
}
