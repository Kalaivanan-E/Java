
class Parent{
    public void m1(){   
        System.out.println("Parent class - m1 method");
    }
    public void m2(){
        System.out.println("Parent class - m2 method");
    }
     public static void main(String[] args){
        Parent p1 = new Parent();
        p1.m1();
        p1.m2();
        Child c1 = new Child();
        c1.m1(); // here we get child class m1() method
        c1.m3();
        Parent c2 = new Child();
        c2.m1(); // here we get parent class m1() method
        c2.m2(); // here we get parent class m2() method
        p1.m1();
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("child class m1 overriding method"); // method overriding
    }
    public void m3(){
        System.out.println("Child class m3 method");
    }
   
}