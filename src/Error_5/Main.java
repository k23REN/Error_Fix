package Error_5;

public class Main {
    public static void main(String[] args) {
        A objA = new B(); // クラスBのインスタンスをクラスAの型で宣言
        objA.print(); // インターフェースのポリモーフィズムを利用して呼び出し
    }
}



/*問題2では、クラスBをクラスAのサブクラスにし、
 * オーバーライドされたprint()メソッドを持つように修正しました。
 * そして、クラスAの型でクラスBのインスタンスを宣言し、
 * ポリモーフィズムを利用して正しいメソッドが呼び出されるようにしました。*/