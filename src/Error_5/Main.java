package Error_5;

public class Main {
    public static void main(String[] args) {
    	//Class Bと表示されるように設定
    	//※B objB = new B();は禁止
        A objA = new B();
        B objB = null;
        //中に入っているのがB本当にかチェック
        if(objA instanceof B) {
        	//ダウンキャスト
        	objB = (B) objA;
        }

        //表示
        objB.print();
    }
}



