public class W9Clock {
    // variabili di istanza
    private int hour, min;

    // Creates a clock whose initial time is h hours and m minutes.
    public W9Clock(int h, int m) {
        hour = h;
        min = m;
        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("non valido");
        }
        if (m < 0 || m > 59) {
            throw new IllegalArgumentException("non valido");
        }
    }

    // Creates a clock whose initial time is specified as a string, using the format
    // HH:MM.
    public W9Clock(String s) {
        hour = Integer.parseInt(s.substring(0, 2));
        min = Integer.parseInt(s.substring(4, 6));
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("non valido");
        }
        if (min < 0 || min > 59) {
            throw new IllegalArgumentException("non valido");
        }

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return hour + ":" + min;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(W9Clock that) {
        boolean a;
        if (hour < that.hour) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if (min < 59) {
            min++;
        } else {
            min = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
    }

    // Test client (see below).
    public static void main(String[] args) {
        W9Clock time = new W9Clock(12, 34);
        StdOut.println(time.toString());
        time.tic();
        StdOut.println(time.toString());
        W9Clock that = new W9Clock(15, 00);
        StdOut.println(time.isEarlierThan(that));

    }
}
