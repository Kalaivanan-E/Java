/* local variable ==> local variable scope is with in the method only
                      there is no default values for local variable, required initialization

 */
class Test{
    // instance variable
    int a = 100;
    static int b = 200;
    public void m1(){
        // local variable
        int c = 300;
        System.out.println(b);
        System.out.println(c); //300
    }
    public void m2(){
        // local variable
        // int d;
        // System.out.println(d); //error before using local variable initialization is required
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.m1();
        t1.m2();
        Test t2 = new Test();
        System.out.println(t1.a);
    }


}