package Error_7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println(person);
    }
}
/*問題3では、Person クラスの toString() メソッドが再帰的に自身を呼び出していたため、
 * 無限ループが発生して StackOverflowError が発生しました。
 * 修正では、toString() メソッドをオーバーライドし、適切な文字列を返すように修正しました。*/
