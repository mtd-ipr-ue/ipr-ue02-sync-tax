import libraries.Out;
import libraries.In;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Geben Sie die x-Koordinate an:");
        double x = In.readDouble();

        Out.println("Geben Sie die y-Koordinate an:");
        double y = In.readDouble();

        double radius = 4;
        double hypotenuse = Math.sqrt(x * x + y * y);

        if (hypotenuse > radius) {
            Out.println("Die Hypotenuse beträgt " + hypotenuse + ". Der Punkt liegt also innerhalb der grünen Fläche!");
        } else {
            Out.println("Die Hypotenuse beträgt " + hypotenuse + "Der Punkt liegt also innerhalb des Kreises!");
        }
    }
}
