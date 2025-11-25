
abstract class Bank{
    public abstract double cal_interest(); 
    public String get_Name(){
        return "Kalai";
    }
    public void wish(){
        System.out.println("Abstract method");
    }
}

class Account extends Bank{
    public double cal_interest(){
        return 0.0;
    }
}

public class Testfour{
     public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.cal_interest());
        System.out.println(a1.get_Name());
        a1.wish();
    }
}
