public class W9ColorHSB {
    // variabili di istanza
    private final int hue, sat, bri;

    // Creates a color with hue h, saturation s, and brightness b.
    public W9ColorHSB(int h, int s, int b) {
        hue = h;
        sat = s;
        bri = b;
    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "(" + hue + "," + sat + "," + bri + ")";
    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        if (sat == 0 || hue == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(W9ColorHSB that) {
        int d = Math.min(((that.hue - hue) * (that.hue - hue)),
                (360 - (Math.abs((that.hue - hue)))) * (360 - (Math.abs((that.hue - hue)))))
                + ((that.sat - sat) * (that.sat - sat))
                + ((that.bri - bri) * (that.bri - bri));
        ;
        return d;
    }

    // Sample client (see below).
    public static void main(String[] args) {
        W9ColorHSB white = new W9ColorHSB(0, 0, 100);
        W9ColorHSB silver = new W9ColorHSB(0, 0, 75);
        W9ColorHSB grey = new W9ColorHSB(0, 0, 150);
        W9ColorHSB black = new W9ColorHSB(0, 0, 0);
        W9ColorHSB red = new W9ColorHSB(0, 100, 100);
        W9ColorHSB maroon = new W9ColorHSB(0, 100, 50);
        W9ColorHSB yellow = new W9ColorHSB(60, 100, 100);
        W9ColorHSB olive = new W9ColorHSB(60, 100, 50);

        W9ColorHSB that = new W9ColorHSB(350, 100, 45);
        W9ColorHSB[] w9ColorHSBs = new W9ColorHSB[8];
        w9ColorHSBs[0] = white;
        w9ColorHSBs[1] = silver;
        w9ColorHSBs[2] = grey;
        w9ColorHSBs[3] = black;
        w9ColorHSBs[4] = red;
        w9ColorHSBs[5] = maroon;
        w9ColorHSBs[6] = yellow;
        w9ColorHSBs[7] = olive;

        int min = 0;
        W9ColorHSB result = new W9ColorHSB(0, 0, 0);
        for (int i = 0; i < w9ColorHSBs.length; i++) {
            int d = w9ColorHSBs[i].distanceSquaredTo(that);
            if (i == 0) {
                min = d;
                result = w9ColorHSBs[i];
            }
            if (d < min) {
                min = d;
                result = w9ColorHSBs[i];
            }
        }
        StdOut.println(result);
    }
}