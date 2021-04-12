public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c)
    {
        if((a + b == c) || (a + c == b) || (b + c == a))
            return true;
        return false;
    }
}
