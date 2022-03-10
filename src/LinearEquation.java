import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {

        int numberA;
        float numberB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A");
        numberA = scanner.nextInt();
        System.out.println("Input B");
        numberB = scanner.nextFloat();

        if (numberA == 0 && numberB != 0) {
            System.out.println("The equation has no solution");
        } else if (numberA == 0) {
            System.out.println("Infinitely many solutions");
        } else {
            System.out.println("Equation: " + (-numberB / numberA));
        }
    }
}
