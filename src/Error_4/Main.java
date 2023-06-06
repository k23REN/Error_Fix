package Error_4;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}

/*問題1では、配列の平均を計算する際にsumをdouble型にキャストしてから
 * array.lengthで除算することで、小数点以下の平均値を正確に取得できるようにしました。*/