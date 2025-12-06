
class Parent {
    public void m1(){
        System.out.println("Parent calss - m1 method");
    }

}
class Child extends Parent{
    public void m2(){
        System.out.println("Child class m2");
    }
}
class Test{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.m1();
        c1.m2();
    }
}
