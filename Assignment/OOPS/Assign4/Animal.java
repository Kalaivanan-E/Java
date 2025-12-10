
class Animal{
    public void makeSound(){};
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow meow");
    }
}
class Cow extends Animal{
    public void makeSound(){
        System.out.println("Moo Moo");
    }
}
class Test{
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
    }
}