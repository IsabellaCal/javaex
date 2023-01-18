import java.awt.Color;

public class W9Potential {
    public static W9Charge[] readCharges() {
        int N = StdIn.readInt();
        W9Charge[] a = new W9Charge[N];
        for (int i = 0; i < N; i++) {
            double x0 = StdIn.readDouble();
            double y0 = StdIn.readDouble();
            double q0 = StdIn.readDouble();
            a[i] = new W9Charge(x0, y0, q0);
        }
        return a;
    }

    public static Color toColor(double V) {
        V = 128 + V / 2.0e10;
        int t = 0;
        if (V > 255)
            t = 255;
        else if (V >= 0)
            t = (int) V;
        return new Color(t, t, t);
    }

    public static void main(String[] args) {
        W9Charge[] a = readCharges();
        int SIZE = 800;
        Picture pic = new Picture(SIZE, SIZE);
        for (int col = 0; col < SIZE; col++)
            for (int row = 0; row < SIZE; row++) {
                double V = 0.0;
                for (int k = 0; k < a.length; k++) {
                    double x = 1.0 * col / SIZE;
                    double y = 1.0 * row / SIZE;
                    V += a[k].potentialAt(x, y);
                }
                pic.set(col, SIZE - 1 - row, toColor(V));
            }
        pic.show();
    }
}
