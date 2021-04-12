

public class Main {
    static boolean palindrome(String s1){
        StringBuilder check = new StringBuilder(s1);
        check = check.reverse();
        String s2 = check.toString();
        if(s1.equals(s2))
            return true;
        return false;
    }
    static long substrCount(int n, String s) {
        long special = n;
        for(int len = 2; len <= n; len++){
            for(int i = 0; i <= n-len;i++){
                String sub = s.substring(i,i+len);
                System.out.println(sub);
                if(palindrome(sub)){
                    System.out.println(palindrome(sub));
                    special++;
                }
            }
        }
        return special;
    }
    public static void main(String[] args) {
        System.out.println(substrCount(7, "abcbaba"));
    }
}
