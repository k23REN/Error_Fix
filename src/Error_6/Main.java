package Error_6;

public class Main {
    public static void main(String[] args) {
        int result = calculateDivision(10, 0);
        System.out.println("Result: " + result);
    }

    public static int calculateDivision(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }
}

/*問題3では、ゼロによる除算を防ぐために、
 * try-catchブロックを使用して除算の箇所を囲み、
 * ArithmeticExceptionをキャッチしてゼロで除算された場合に
 * エラーメッセージを表示するようにしました。
 * その後、0を返して処理を続行するようにしました。*/