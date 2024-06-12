class Demo {

    void fun() {
        System.out.println("in fun() function.");
    }

    static void run() {
        System.out.println("in run() function.");
    }

    public static void main(String[] args) {
        System.out.println("in main() method.");
        run();
        Demo obj = new Demo();
        obj.fun();
}
}