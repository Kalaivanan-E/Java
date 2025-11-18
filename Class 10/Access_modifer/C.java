package pack2;
import pack1.A;
class C extends A{ // A is a parent class, C is a child class
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        // c.m2(); default 
        // c.m3(); private
        c.m4(); 
    }    
}
