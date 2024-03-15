import java.util.Scanner;
public class MathOperation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for two integers
        System.out.print("Enter first number:");
        int  num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();
        // Calculation
        int  sum = num1 + num2;
        int  difference = num1 - num2;
        int  product = num1 * num2;
        double average =(double) sum / 2;
        int  distance = Math.abs(num1 - num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        System.out.printf("The sum :%d\n",sum);
        System.out.printf("The difference :%d\n",difference);
        System.out.printf("The product :%d\n",product);
        System.out.printf("The average :%.2f\n",average);
        System.out.printf("The distance :%d\n",distance);
        System.out.printf("The maximum :%d\n",max);
        System.out.printf("The minimum :%d\n",min);

        scanner.close();

    }
}