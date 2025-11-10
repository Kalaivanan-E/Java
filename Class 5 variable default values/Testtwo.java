class Test{
    int a;  // instance variable
    int b =10; 
    static int c = 20;  // static variable
    int[] eids = new int[4];

    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test();
        // System.out.println(a);   // compile error we can't access instance variable directly
        System.out.println(t1.a);   // accessing instance variable using object 
        System.out.println(t1.a+ t2.b); //10
        System.out.println(c+ t1.c + Test.c); //60   accessing static variable directly, object name, or class name

        t1.eids[0] = 101;
        t2.eids[0] = 1001;
        t1.eids[2] = 103;
        t2.eids[2] = 1002;
        System.out.println(t1.eids[0]);  // 101
        System.out.println(t2.eids[0]);  // 1001
        System.out.println(t1.eids[1]);  // 0
        System.out.println(t1.eids[0] + t2.eids[0]);  // 1102
    }

}