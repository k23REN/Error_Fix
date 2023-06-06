package Error_5;

public class Main {
    public static void main(String[] args) {
    	//Class Bと表示されるように設定
    	//※B objB = new B();は禁止
        A objA = new A();
        B objB = (B) objA;
        objB.print();
    }
}



