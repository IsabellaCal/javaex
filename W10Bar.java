import java.util.Arrays;

public class W10Bar implements Comparable<W10Bar> {
    public String name;
    public int value;
    public String category;

    // Creates a new bar.
    public W10Bar(String name, int value, String category) {
        this.name = name;
        this.value = value;
        this.category = category;
    }

    // Returns the name of this bar.
    public String getName() {
        return name;
    }

    // Returns the value of this bar.
    public int getValue() {
        return value;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return category;
    }

    // Compare two bars by value.
    public int compareTo(W10Bar that) {
        if (this.value < that.getValue()) {
            return -1;
        } else if (this.value == that.getValue()) {
            return 0;
        } else {
            return 1;
        }
    }

    // Sample client (see below).
    public static void main(String[] args) {
        W10Bar[] bars = new W10Bar[10];
        bars[0] = new W10Bar("Beijing", 22674, "East Asia");
        bars[1] = new W10Bar("Cairo", 19850, "Middle East");
        bars[2] = new W10Bar("Delhi", 27890, "South Asia");
        bars[3] = new W10Bar("Dhaka", 19633, "South Asia");
        bars[4] = new W10Bar("Mexico City", 21520, "Latin America");
        bars[5] = new W10Bar("Mumbai", 22120, "South Asia");
        bars[6] = new W10Bar("Osaka", 20409, "East Asia");
        bars[7] = new W10Bar("São Paulo", 21698, "Latin America");
        bars[8] = new W10Bar("Shanghai", 25779, "East Asia");
        bars[9] = new W10Bar("Tokyo", 38194, "East Asia");

        // sort in ascending order by weight
        Arrays.sort(bars);

        System.out.println(Arrays.deepToString(bars));
    }
}
