import java.util.Arrays;

public class MinMax {
    public static void findMinMax(int[] arr) {
        int min = Arrays.stream(arr).min().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        int max = Arrays.stream(arr).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 3, 8, 9, 1};
        findMinMax(numbers);
    }
}
