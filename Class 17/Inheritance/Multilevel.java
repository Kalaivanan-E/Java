

class GrandParent{
    public void m1(){
        System.out.println("GrandParent class - m1 method");
    }
}
class Parent extends GrandParent{
    public void m2(){
        System.out.println("Parent class - m2 method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("Child class - m3 method");
    }
}
class Test{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}