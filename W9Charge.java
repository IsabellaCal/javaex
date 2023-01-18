//anatomia di una classe
public class W9Charge {

    // variabili di istanza
    private final double rx, ry; // position
    private final double q; // charge value
    // costruttore

    public W9Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }

    // metodi
    public double potentialAt(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return q + " at " + "(" + rx + ", " + ry + ")";
    }

    // test client
    public static void main(String[] args) {
        W9Charge c = new W9Charge(.72, .31, 21.3);
        StdOut.println(c);
        StdOut.printf("%6.2e\n", c.potentialAt(.42, .71));
    }
}
