public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");
        else {
            int rev = reverse(number);
            int copyrev = rev;
            if(number==0)
                System.out.println("Zero");
            while (rev != 0)
            {
                switch(rev%10)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("OTHER");
                }
                rev /= 10;
            }
            int orgDigits = getDigitCount(number);
            int revDigits = getDigitCount(copyrev);
            int diff = orgDigits - revDigits;
            if (diff > 0) {
                for (int i = 0; i < diff; i++)
                    System.out.println("Zero");
            }
        }
    }

    public static int reverse(int num) {
        int rev = 0;
        if(num==0)
            return 0;
        while (num != 0) {
            rev = (rev*10) + (num % 10);
            num /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if(number==0)
            return 1;
        int count = 0;
        while (number != 0)
        {
            count++;
            number /= 10;
        }
        return count;
    }
}
