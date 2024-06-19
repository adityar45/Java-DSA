class Outer {

    int x = 10;
    static int y = 20;

    Outer() {
        System.out.println("Outer Constructor");
    }

    void fun() {

        int a = 30;
        int b = 40;
    }

    static void run() {
        int c = 50;
        int d = 60;
    }

    class Inner {

        static int e = 70;
        int f = 80;
        int x = 90;
        int y = 100;

        Inner(int x) {
            System.out.println("Inner Constructor");
            System.out.println("Outer instance x : "+Outer.this.x);
            System.out.println("Outer static y : "+Outer.this.y);
            System.out.println("Outer static y : "+Outer.y);
            System.out.println("inner  y : "+y);
            System.out.println("Inner static e : "+e);
            System.out.println("Inner instance f : "+f);
            System.out.println("Inner x - Parameterized constructor : "+x);
            System.out.println("Inner x(using this) : "+this.x);
            System.out.println("Inner y : "+y);
            System.out.println("Inner y(using this) : "+this.y);
        }
    }

    public static void main(String[] args) {

        Outer outObj1 = new Outer();
        Inner obj = outObj1.new Inner(120);
    }
}