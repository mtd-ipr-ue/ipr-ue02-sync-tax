import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
        double radius = 4;

        Out.println("Geben Sie die x-Koordinate an:");
        double x = In.readDouble();
        Out.println("Geben Sie die y-Koordinate an:");
        double y = In.readDouble();

        double hypotenuse = Math.sqrt(x * x + y * y);

        if (isInBound(x, radius) && isInBound(y, radius) && hypotenuse > radius) {
            Out.println("Der Punkt liegt innerhalb der grünen Fläche!");
        } else {
            Out.println("Der Punkt liegt NICHT innerhalb der grünen Fläche!");
        }
    }
    public  static  boolean isInBound(double number, double radius) {
        return number > 0 && number <= radius;
    }
}
