import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the number from the user
        System.out.print("Enter any number:");
        double number = scanner.nextDouble();
        // Calculate square ,cube and forth power
        double square = number * number;
        double cube = Math.pow(number,3);
        double fourth = Math.pow(number, 4);
       System.out.printf("Square : %.2f\n",square);
       System.out.printf("Cube : %.2f\n",cube);
       System.out.printf("Fourth power : %.2f",fourth);

       scanner.close();
    }
}
