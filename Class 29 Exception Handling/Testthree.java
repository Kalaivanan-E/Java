

// user throw the exception to JVM

class Testthree{
    public static void main(String[] args) {
        System.out.println(10/2);
        throw new ArithmeticException("Can't divide by zero");
        System.out.println("Good Morning");
    }
}