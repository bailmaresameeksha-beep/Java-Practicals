class Example {

    static void approach1(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) count++;
        }
        System.out.println("Approach1 Count: " + count);
    }

    static void approach2(char ch, String str) {
        int count = str.length() - str.replace(String.valueOf(ch), "").length();
        System.out.println("Approach2 Count: " + count);
    }

    static void approach3(char ch, String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println("Approach3 Count: " + count);
    }

    public static void main(String[] args) {

        try {
            if (args.length < 2) {
                System.out.println("Error: Pass 2 arguments");
                return;
            }

            if (args.length > 2) {
                System.out.println("Warning: Extra arguments ignored");
            }

            String first = args[0];
            String str = args[1];

            if (first.length() != 1) {
                System.out.println("Error: First argument must be a single character");
                return;
            }

            char ch = first.charAt(0);

            approach1(ch, str);
            approach2(ch, str);
            approach3(ch, str);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }
}