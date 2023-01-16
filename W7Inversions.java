import java.util.Arrays;

public class W7Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (i < j && a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] b = new int[n];
        if (n >= 0 && k >= 0 && k <= 0.5 * n * (n - 1)) {
            for (int i = 0; i < n; i++) {
                b[i] = i;
            }
            for (int i = 1; i < k + 1; i++) {
                int t = b[n - i];
                b[n - i] = b[n - 1 - i];
                b[n - 1 - i] = t;
            }
        }
        return b;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int[] a = { 1, 5, 3, 7, 6, 2, 4, 9, 8 };
        System.out.println(count(a));
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(Arrays.toString(generate(n, k)));
    }
}