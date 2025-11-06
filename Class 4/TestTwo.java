
class Test{
    int a = 10;            // instance variable
    static int b = 20;     // static variable

    public static void m1(){
        int c = 30;     // local variable scope is with in the method only
        System.out.println(c);
    }
    public static void main(String[] args) {
        int eid =101;
        Test t1 = new Test();
        System.out.println(t1.a);   // 10  instance variable
        System.out.println(t1.b);   // 20  using object variable
        System.out.println(Test.b);  //20  using classname
        System.out.println(b);   //20    using directly
        // System.out.println(c);   // here we can't access the local variable

    }
}