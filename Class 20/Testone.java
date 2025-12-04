
class Test{
    int a;
    byte b;
    short s;
    boolean bool;
    long l;
    char c;
    double d;


    Test(){
        this.a = 0;
        this.b = 0;
        this.s = 0;
        this.bool = false;
        this.l = 0;
        this.c = 0;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(t1.s);
        System.out.println(t1.bool);
        System.out.println(t1.l);
        System.out.println(t1.c);
    }
}