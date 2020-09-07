import org.w3c.dom.ls.LSOutput;

public class ArithmeticPractice {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2)); //3
        System.out.println(sumDouble(3, 2)); //→ 5
        System.out.println(sumDouble(2, 2));//→ 8



    }

    public static int sumDouble(int a, int b) {
        if (a != b){
            return a+b;
        } return 2 * (a+b);
    }



}
