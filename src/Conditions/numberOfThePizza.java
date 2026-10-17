package Conditions;

public class numberOfThePizza{
    public static boolean isNumber(int num, int size) {
        if(num >= 1 && num <= size) {
            return false;
        }
        return true;
    }
}