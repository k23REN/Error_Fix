package Error_3;
import java.util.Optional;
public class Main {
	/*
    public static void main(String[] args) {
        String message = null;//このコードは修正禁止
        int length = 0;
        if (message != null) {
            length = message.length();
        }
        System.out.println("Message length: " + length);
    }
    */

    public static void main(String[] args) {
        String message = null;//このコードは修正禁止
        Optional<String>str = Optional.ofNullable(message);
        int length = 0;
        if (message != null) {
            length = message.length();
        }
        System.out.println("Message length: " + length);
    }
}

/*問題3では、messageがnullである場合にlengthの初期値を設定するようにしました。
 * nullの文字列の長さを計算しようとすると、
 * NullPointerExceptionが発生しますので、message != nullという条件文で処理を制御しています。*/
