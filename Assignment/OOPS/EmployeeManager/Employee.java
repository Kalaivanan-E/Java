

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee{
    double bonus;
    public Manager(String name, double salary){
        super(name, salary);
    }
    public double calculateSalary(double bonus){
        salary = salary + bonus;
        return salary;
    }
    public static void main(String[] args) {
        Manager emp1 = new Manager("Rahul", 5000.00);
        System.out.println(emp1.calculateSalary(1000));
    }
}
