import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        int[] numbers = getNumbers(3);

        int max = checkMax(numbers);
        Out.println("max number: " + max);
    }

    public static int[] getNumbers(int anzahl) {
        int[] numbers = new int[anzahl];
        for (int i = 1; i <= anzahl; i++) {
            Out.println("Enter Nr." + i);
            numbers[i - 1] = In.readInt();
        }
        return numbers;
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
