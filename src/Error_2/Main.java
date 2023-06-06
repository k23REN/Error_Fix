package Error_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}

/*問題2では、scanner.nextInt()の代わりにscanner.nextLine()を使用しました。
 * 名前は文字列として扱われるため、nextInt()は適切なメソッドではありません。*/