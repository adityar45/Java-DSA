//Logical AND, OR, NOT

class program4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("true && false : "+(a < b && c > d));
        System.out.println("true || false : "+(a < b || c > d));
        System.out.println("!true         : "+!(a < b));
        System.out.println("!false        : "+!(c > d));



    }
}