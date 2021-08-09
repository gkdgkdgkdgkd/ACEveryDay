package utils;

import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static int randomInt(){
        return random.nextInt();
    }

    public static int randomInt(int bound){
        return random.nextInt(bound);
    }

    public static int randomIntClosed(int start,int end){
        return random.nextInt(end - start + 1) + start;
    }
}
