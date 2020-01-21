import java.math.BigInteger;
import java.util.*;

public class Level1 {
    public static int[] UFO(int N, int[] data, boolean octal) {
        int[] res = new int[N];
        if (octal) {
            for (int i = 0; i < N; i++) {
                Integer temp = data[i];
                BigInteger temp10 = new BigInteger("" + temp, 8);
                res[i] = temp10.intValue();
            }
        } else {
            for (int i = 0; i < N; i++) {
                Integer temp = data[i];
                BigInteger temp10 = new BigInteger("" + temp, 16);
                res[i] = temp10.intValue();
            }
        }
        return res;
    }
}