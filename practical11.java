class UsingString {
    static String build() {
        String s = "UTSAV";
        for (int i = 1; i <= 2026; i++) {
            s = s + "_" + i;
        }
        return s;
    }
}

class UsingStringBuffer {
    static String build() {
        StringBuffer sb = new StringBuffer("UTSAV");
        for (int i = 1; i <= 2026; i++) {
            sb.append("_").append(i);
        }
        return sb.toString();
    }
}

class UsingStringBuilder {
    static String build() {
        StringBuilder sb = new StringBuilder("UTSAV");
        for (int i = 1; i <= 2026; i++) {
            sb.append("_").append(i);
        }
        return sb.toString();
    }
}

class CompareTime {
    public static void main(String[] args) {

        long start1 = System.nanoTime();
        String s1 = UsingString.build();
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        String s2 = UsingStringBuffer.build();
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        String s3 = UsingStringBuilder.build();
        long end3 = System.nanoTime();

        System.out.println("String Time: " + (end1 - start1));
        System.out.println("StringBuffer Time: " + (end2 - start2));
        System.out.println("StringBuilder Time: " + (end3 - start3));
    }
}