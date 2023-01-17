import java.awt.Color;

public class W8Scale {
    public static void main(String[] args) {
        String filename = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);
        Picture source = new Picture(filename);
        Picture target = new Picture(w, h);
        for (int tcol = 0; tcol < w; tcol++)
            for (int trow = 0; trow < h; trow++) {
                int scol = tcol * source.width() / w;
                int srow = trow * source.height() / h;
                Color color = source.get(scol, srow);
                target.set(tcol, trow, color);
            }
        target.show();
    }
}
