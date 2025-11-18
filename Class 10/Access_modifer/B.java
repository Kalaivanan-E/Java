package pack1;

 class B {
    public void m5(){
        System.out.println("Default class B - public method m5");
    }
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.m1();
        a.m2();
        // a.m3(); // private 
        a.m4();
        b.m5();
    }
    
}
