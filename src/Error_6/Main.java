package Error_6;

public class Main {
    public static void main(String[] args) {
        int result = calculateDivision(10, 0);//ここの変更禁止
        System.out.println("Result: " + result);
    }

    public static int calculateDivision(int dividend, int divisor) {
        return dividend / divisor;
    }
}