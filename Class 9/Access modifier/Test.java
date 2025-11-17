package pack2;
import pack1.A;
// import pack1.B;  it is a default so we can't access outside package

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        // a.m2(); // it is default method so we can't access outside package
        //a.m3(); // private access in A
    }
    
}
