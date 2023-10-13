import java.util.Arrays;
import java.util.Random;

public class ShuffleA{
    public static void main(String[] args) {
        int[] originalA= {1, 2, 3, 4, 5, 6, 7};

        int[] shuffledA = Arrays.copyOf(originalA, originalA.length);

        shuffleA(shuffledA);

        System.out.println("Original Array: " + Arrays.toString(originalA));
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledA));
    }

    public static void shuffleA(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            
            int randomIndex = rand.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}