

class Parent {
    public void m1(){
        System.out.println("Parent class - m1 methods");
    }
}
class Child extends Parent{
    public void m2(){
        System.out.println("Child class - m2 methods");
    }
    public void m3(){
        System.out.println("Child class - m3 methods");
    }
}
class Test {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1();
        // p1.m2(); we can't access child method
        Child c1 = new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        Parent c2 = new Child();
        c2.m1();
        // c2.m2(); we can't access child method
        // c2.m3(); we can't access child method
        // Child p3 = new Parent()  child type can't refer parent object

    }
}