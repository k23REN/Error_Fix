package Error_4;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}