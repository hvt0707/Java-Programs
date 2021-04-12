public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int rev=0;
        int copy = number;
        while(copy!=0)
        {
            rev = rev*10 + (copy%10);
            copy/=10;
        }
        if(number==rev)
            return true;
        return false;
    }
}
