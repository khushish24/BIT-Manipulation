public class Solution {
    static int INT_MAX = 2147483647;
    public int solve(int A) {
        int pal_count = 0;
        int i = 0;
        for (i = 1; i <= INT_MAX; i++) {
            if (binaryPal(i) > 0) {
                pal_count++;
            }
            if (pal_count == A)
                break;
        }
 
        return i;
    }
    public int binaryPal(int x)
    {
        int l = leftBit(x);
        int r = 1;
        while (l > r) {
            if (isKthBitSet(x, l) != isKthBitSet(x, r))
                return 0;
            l--;
            r++;
        }
        return 1;
    }
    public int leftBit(int x)
    {
        int count = 0;
        while (x > 0) {
            count++;
            x = x >> 1;
        }
        return count;
    }
    public int isKthBitSet(int x, int k)
    {
        return ((x & (1 << (k - 1))) > 0) ? 1 : 0;
    }
}
