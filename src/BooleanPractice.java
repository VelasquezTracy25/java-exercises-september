public class BooleanPractice {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false)); //true
        System.out.println(sleepIn(true, false)); //false
        System.out.println(sleepIn(false, true)); //true

        System.out.println(monkeyTrouble(true, true)); // → true
        System.out.println(monkeyTrouble(false, false)); // → true
        System.out.println(monkeyTrouble(true, false)); // → false

        System.out.println(parrotTrouble(true, 6)); //→ true
        System.out.println(parrotTrouble(true, 7)); //→ false
        System.out.println(parrotTrouble(false, 6));// → false}

        System.out.println(makes10(9, 10)); //→ true
        System.out.println(makes10(9, 9)); //→ false
        System.out.println(makes10(1, 9));// → true

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

//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)){
            return true;
        } return false;
    }


//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }


}
