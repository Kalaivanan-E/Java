class Test{
    int a;
     static String b;
    public static void main(String[] args) {
        int a = 100;
        Test t1 = new Test();
        System.out.println(t1.a);  // 0
        System.out.println(t1.b);  // null
    }
}