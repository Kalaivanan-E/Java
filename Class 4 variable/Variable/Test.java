import Test;

package Variable;
class Test{

    int a = 10;
    int b = 20;
    static int c = 30;
    public static void main (String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.a + t2.a);  //20  here with creating object we are accessing instance variable
        t2.a = 11;
        System.out.println(t1.a + t2.a);  //21
        System.out.println(t1.b + t2.b + Test.c);   // we can use static var using object, classname, directly
        System.out.println(Test.c); // 30
    }
}