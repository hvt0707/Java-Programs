//public class LastDigitChecker {
//    public static boolean hasSameLastDigit(int a, int b, int c) {
//        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000)
//            return false;
//        if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10)
//            return true;
//        return false;
//    }
//}
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first,int second)
    {
        int i=0;
        if(first<10 || second <10)
            return -1;
        if(first > second)
        {
            first = first + second;
            second = first - second;
            first = first - second;
        }
        for(i=first ; i>=1 ; i--)
        {
            if(first%i == 0 && second%i == 0)
               break;
        }
       return i;
    }
}
