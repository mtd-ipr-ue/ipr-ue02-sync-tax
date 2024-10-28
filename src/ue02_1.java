import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        Out.println("1st Number:");
        numbers[0] = In.readInt();

        Out.println("2nd Number:");
        numbers[1] = In.readInt();

        Out.println("3rd Number:");
        numbers[2] = In.readInt();

        int max = checkMax(numbers);
        Out.println("max number: " + max);
    }

    public static int checkMax(int[] numbers) {
        int currentMax = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > currentMax) {
                currentMax = numbers[i];
            }
        }
        return currentMax;
    }
}
