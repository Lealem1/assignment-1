public class Main {
    public static void main(String[] args) {
        //variable declaration
        int a= 100;
        int b= 50;
        double myVar = 12.5;

        int sum= a+b;
        double division=myVar/2;
        int modulus=b%3;

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Division: " + division );
        System.out.println("Modulus: " + modulus);

        boolean value1 = a > b;
        boolean value2 = a < b;

        if (value1) {
            System.out.println("a is the big guy"); }
        else if(value2){
            System.out.println("a is the little one"); }
        else {
            System.out.println("both are twins"); }

        for ( int i=0; i<5; i++) System.out.println("BORING!!!");
    }
    public static int divide(int a, int b) {
        return a/b;

    }
}