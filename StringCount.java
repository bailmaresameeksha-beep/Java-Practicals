class StringCount {

    public static int countIter1(String s1, String s2) {
        int count = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }
        return count;
    }

    public static int countIter2(String s1, String s2) {
        int count = 0;
        int index = 0;
        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index = index + s2.length();
        }
        return count;
    }

    public static int countIter3(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            int j = 0;
            while (i + j < s1.length() && j < s2.length() && s1.charAt(i + j) == s2.charAt(j)) {
                j++;
            }
            if (j == s2.length()) {
                count++;
            }
        }
        return count;
    }

    public static int countRec1(String s1, String s2, int index) {
        if (index > s1.length() - s2.length()) return 0;
        if (s1.substring(index, index + s2.length()).equals(s2))
            return 1 + countRec1(s1, s2, index + 1);
        return countRec1(s1, s2, index + 1);
    }

    public static int countRec2(String s1, String s2) {
        if (s1.length() < s2.length()) return 0;
        if (s1.startsWith(s2))
            return 1 + countRec2(s1.substring(s2.length()), s2);
        return countRec2(s1.substring(1), s2);
    }

    public static int countRec3(String s1, String s2, int i, int j) {
        if (i >= s1.length()) return 0;
        if (j < s2.length() && i + j < s1.length() && s1.charAt(i + j) == s2.charAt(j)) {
            if (j == s2.length() - 1)
                return 1 + countRec3(s1, s2, i + 1, 0);
            return countRec3(s1, s2, i, j + 1);
        }
        return countRec3(s1, s2, i + 1, 0);
    }

    public static void main(String[] args) {
        String s1 = "SGGSIE&TSGGS";
        String s2 = "SGGS";

        System.out.println(countIter1(s1, s2));
        System.out.println(countIter2(s1, s2));
        System.out.println(countIter3(s1, s2));
        System.out.println(countRec1(s1, s2, 0));
        System.out.println(countRec2(s1, s2));
        System.out.println(countRec3(s1, s2, 0, 0));
    }
}