public class W9Complex {
    private final double re;
    private final double im;

    public W9Complex(double real, double imag) {
        re = real;
        im = imag;
    }

    public W9Complex plus(W9Complex b) {
        double real = re + b.re;
        double imag = im + b.im;
        return new W9Complex(real, imag);
    }

    public W9Complex times(W9Complex b) {
        double real = re * b.re - im * b.im;
        double imag = re * b.im + im * b.re;
        return new W9Complex(real, imag);
    }

    public double abs() {
        return Math.sqrt(re * re + im * im);
    }

    public String toString() {
        return re + " + " + im + "i";
    }

    public static void main(String[] args) {
        W9Complex a = new W9Complex(3.0, 4.0);
        W9Complex b = new W9Complex(-2.0, 3.0);
        StdOut.println("a = " + a);
        StdOut.println("b = " + b);
        StdOut.println("a * b = " + a.times(b));
    }
}
