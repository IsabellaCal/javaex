public class W11MergeSort {
    private static String[] aux;

    public static void merge(String[] a, int lo, int mid, int hi) {
        int i = lo, j = mid, N = hi - lo;
        for (int k = 0; k < N; k++) {
            if (i == mid)
                aux[k] = a[j++];
            else if (j == hi)
                aux[k] = a[i++];
            else if (a[j].compareTo(a[i]) < 0)
                aux[k] = a[j++];
            else
                aux[k] = a[i++];
        }
        // Copy back into a[lo, hi)
        for (int k = 0; k < N; k++)
            a[lo + k] = aux[k];
    }

    public static void sort(String[] a) {
        aux = new String[a.length];
        sort(a, 0, a.length);// Allocate just once! sort(a, 0, a.length);
    }

    public static void sort(String[] a, int lo, int hi) { // Sort a[lo, hi).
        int N = hi - lo;
        if (N <= 1)
            return;
        int mid = lo + N / 2;
        sort(a, lo, mid);
        sort(a, mid, hi);
        merge(a, lo, mid, hi);
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        String[] a = in.readAllStrings();
        sort(a);

        for (int i = 0; i < a.length; i++)
            StdOut.println(a[i]);
    }
}
