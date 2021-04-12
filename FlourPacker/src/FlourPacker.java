public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int count = bigCount;
        int reminder = 0;
        bigCount *= 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        do {
            do {
                if (bigCount + reminder == goal) return true;
                reminder++;
            } while (reminder <= smallCount);
            bigCount -= 5;
            reminder = 0;
            count--;
        } while (count > 0);

        return false;
    }
}