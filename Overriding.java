class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }
}

 class TestOverride {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}