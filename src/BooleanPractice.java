public class BooleanPractice {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false)); //true
        System.out.println(sleepIn(true, false)); //false
        System.out.println(sleepIn(false, true)); //true

        System.out.println(monkeyTrouble(true, true)); // → true
        System.out.println(monkeyTrouble(false, false)); // → true
        System.out.println(monkeyTrouble(true, false)); // → false

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        if ((aSmile && bSmile) || (!bSmile && !aSmile)){
            return true;
        }
        return false;
    }






}
