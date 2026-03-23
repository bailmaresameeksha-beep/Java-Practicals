class Demo {
    int x;

    Demo(int a) {
        x = a;
    }

    void display() {
        System.out.println(x);
    }
}

public class TestCons2 {
    public static void main(String[] args) {
        Demo d = new Demo(10);
        d.display();
    }
}