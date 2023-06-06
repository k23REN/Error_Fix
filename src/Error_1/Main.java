package Error_1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

/*問題1では、forループの終了条件を修正して、i < numbers.lengthとしました。
 * 配列のインデックスは0から始まるため、
 * i <= numbers.lengthとすると範囲外のインデックスにアクセスしてしまいます。*/
