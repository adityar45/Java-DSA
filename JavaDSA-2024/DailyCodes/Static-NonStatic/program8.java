class Demo {

    void fun() {
        System.out.println("in fun() function.");
    }

    void run() {
        System.out.println("in run() function.");
    }

    void gun() {
        System.out.println("in gun() function.");
    }

    public static void main(String[] args) {
        System.out.println("in main() method.");
        fun();
        gun();
        run();
}
}