package Error_3;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String message = null;//このコードは編集禁止
        //nullの場合でも格納
        Optional<String> str = Optional.ofNullable(message);
        int length = 0;

        //値が入っているかチェック
        if(str.isPresent() == true) {
        	//文字数代入
        	length = str.get().length();
        }

        System.out.println("Message length: " + length);
    }
}