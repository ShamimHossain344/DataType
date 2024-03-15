import java.util.Scanner;
public class Measurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // user input
        System.out.print("Enter measurement in meter:");
        double meter = scanner.nextInt();
        // calculation
        double miles = meter * 0.000621371;
        double feet = meter * 3.28084;
        double inches = meter * 39.3701;
        System.out.printf("Miles : %.2f\n",miles);
        System.out.printf("Feet : %.2f\n",feet);
        System.out.printf("Inches :%.2f\n",inches);

        scanner.close();
    }
}
