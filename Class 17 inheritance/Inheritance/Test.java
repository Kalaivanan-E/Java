

//Create a parent class Vehicle and child class Car.

class Vehicle{
    
    public void start(){
        System.out.println("Vehicle startedd");
    }
    

}
class Car extends Vehicle{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}