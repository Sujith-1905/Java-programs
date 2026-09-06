import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Sum = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Division = " + (a / b));
    }
}
