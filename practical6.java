class BaseConverter {
    public static void main(String[] args) {
        BaseConverter converter = new BaseConverter();
        
        converter.convert("0xFF");
        converter.convert("0b1010");
        converter.convert("017");
        converter.convert("100");
    }

    public void convert(String input) {
        String s = input.trim().toLowerCase();
        int result;
        String type;

        if (s.startsWith("0x")) {
            result = Integer.parseInt(s.substring(2), 16);
            type = "Hexadecimal";
        } else if (s.startsWith("0b")) {
            result = Integer.parseInt(s.substring(2), 2);
            type = "Binary";
        } else if (s.startsWith("0") && s.length() > 1) {
            result = Integer.parseInt(s.substring(1), 8);
            type = "Octal";
        } else {
            result = Integer.parseInt(s);
            type = "Decimal";
        }

        System.out.println(type + " -> " + result);
    }
}