// inheritance if we want to access parent functionality in child class.
//  we can access using keyword extends.
// inheritance object from one class to another class
// we can't access child type reference for parent object but we can access parent reference to child object

class parent{
    public void m1(){
        System.out.println("Parent Class - m1 method");
    }
    public void m2(){
        System.out.println("Parent class m2 method");
    }
}
class child extends parent{
    public void m3(){
        System.out.println("child class m3");
    }
}

