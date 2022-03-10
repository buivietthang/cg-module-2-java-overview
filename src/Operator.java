import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        int width;
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width");
        width = scanner.nextInt();
        System.out.println("Input height");
        height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input string");
        String string = scanner.nextLine();

        int area = width * height;
        System.out.println("Area: " + area);
        System.out.println(string);
    }
}
