public class W7Ramanujan2 {
    // Is n a Ramanujan number? Questo codice funziona ma è troppo complesso
    public static boolean isRamanujan2(long n) {
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (i * i * i + j * j * j == n)
                    count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan2(n));
    }
}
