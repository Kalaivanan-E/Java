package pack1;

 class B {
    public void m5(){
        System.out.println("Default class B - public method m5");
    }
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        // a.m3();  // within the class only
        a.m4();
    }    
}
// how to compile 
// 1) javac -d . A.java
// 2) javac -d . B.java
// to execute because B.java has the main method
// 3) java pack1.B