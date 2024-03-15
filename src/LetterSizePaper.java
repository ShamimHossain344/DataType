public class LetterSizePaper {
    // Constant
    static final double INCH_TO_MM = 25.4;
    static final double WIDTH_IN_INCHES = 8.5;
    static final double HEIGHT_IN_INCHES = 11.0;

    public static void main(String[] args) {
        // convert dimensions to millimeters
        double width_mm = WIDTH_IN_INCHES * INCH_TO_MM;
        double height_mm = HEIGHT_IN_INCHES * INCH_TO_MM;
        // calculator perimeter
        double perimeters_mm = 2 * (width_mm + height_mm);
        // calculator diagonal length
        double diagonal_length_mm = Math.sqrt(Math.pow(width_mm, 2) + Math.pow(height_mm, 2));
        // Print result
        System.out.print("The Width and Height :");
        System.out.printf("%.2f  %.2f\n", width_mm, height_mm);

        System.out.print("The perimeter : ");
        System.out.printf("%.2f\n",perimeters_mm);
        System.out.print("The length of diagonal :");
        System.out.printf("%.2f \n", diagonal_length_mm);

    }

}
