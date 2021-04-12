public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        int num3 = (int)(num1*1000);
        int num4 = (int)(num2*1000);
        if(num3==num4)
            return true;
        return false;
    }
}
