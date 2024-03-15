import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextInt();

        double area = length * width;
        double perimeter = 2 * (length + width);

        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.printf("The area of Rectangle: %.2f\n",area);
        System.out.printf("The perimeter of Rectangle :%.2f\n",perimeter);

    }
}
