class hello {

    static public void main(String[] args) {
        int n = 5;  
        int result = factorial(n);
        System.out.println(result);
    }

    static int factorial(int n) {
        int fact = 1;

        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
}
