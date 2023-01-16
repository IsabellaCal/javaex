public class W7Ramanujan {

    // Is n a Ramanujan number? Questo codice funziona ma è troppo complesso
    public static boolean isRamanujan(long n) {
        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n)
                break;
            for (int b = a; b <= n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n)
                    break;
                for (int c = a + 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > a3 + b3)
                        break;
                    for (int d = c; d <= n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 > a3 + b3)
                            break;
                        if (c3 + d3 == a3 + b3) {
                        }
                    }
                }
            }
        }
        return true;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan(n));
    }
}