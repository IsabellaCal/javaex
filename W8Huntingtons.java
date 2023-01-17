public class W8Huntingtons {
    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < dna.length(); i += 3) {
            String a = dna.substring(i, i + 3);
            if (a.equals("CAG")) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines)
    // removed.
    public static String removeWhitespace(String s) {
        String result = s.replace(" ", "");
        return result;
    }

    // Returns one of these diagnoses corresponding to the maximum number of
    // repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats >= 0 && maxRepeats < 10)
            return "not human";
        if (maxRepeats >= 10 && maxRepeats < 36)
            return "normal";
        else if (maxRepeats >= 36 && maxRepeats < 40)
            return "high risk";
        else if (maxRepeats >= 40 && maxRepeats < 181)
            return "Huntington's";
        else
            return "not human";
    }

    // Sample client (see below).
    public static void main(String[] args) {
        String s = "TTTTTTTTTCAGCAGCAGCAG TTTCAGCAGCAGCAGCAGCAGCAGCAG TTTTTTTTT";
        StdOut.println(removeWhitespace(s));
        StdOut.println(maxRepeats(removeWhitespace(s)));
        StdOut.println(diagnose(maxRepeats(removeWhitespace(s))));
    }

}
