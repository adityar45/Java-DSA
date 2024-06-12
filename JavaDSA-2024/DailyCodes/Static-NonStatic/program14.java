class Demo {

    int x = 30;
    static int y = 40;

    void fun() {
        System.out.println("in fun() function.");
    }

    static void run() {
        System.out.println("in run() function.");
    }

    public static void main(String[] args) {
        System.out.println("in main() method.");
        Demo obj = new Demo();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun();
        obj.run();
}
}