import java.util.Scanner;

public class AreaCircumference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextInt();

        double Area = Math.PI * Math.pow(radius, 2);
        double Circumference = 2 * Math.PI * radius;

        double Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("The area of circle :%.2f\n",Area);
        System.out.printf("The circumference of circle : %.2f\n",Circumference);
        System.out.printf("The volume of Sphere : %.2f\n",Volume);
        System.out.printf("The surface area of sphere : %.2f",sphereSurfaceArea);

        scanner.close();
    }
}
