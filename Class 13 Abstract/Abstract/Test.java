// class contain concrete and non concrete methods
// Abstract is applicable for class and method
// abstract method has only declaration not a implementation

abstract class Bank{
    public abstract double cal_interest();
    public String get_Name(){
        return "Rahul";
    }
}
class Account extends Bank{
    public double cal_interest(){
        return 0.0;
    }
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.cal_interest());  // 0.0
        System.out.println(a1.get_Name());    // Rahul
    }
}