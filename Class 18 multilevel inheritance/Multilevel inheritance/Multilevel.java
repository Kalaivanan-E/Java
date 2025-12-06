
class Bank{
    public void m1(){
        System.out.println("Bank class - m1 method");
    }
}
class Account extends Bank{
    public void m2(){
        System.out.println("Account class - m2 method");
    }
}
class SavingAccount extends Account {
    public void m3(){
        System.out.println("Saving Account class - m3 method");
    }
    public String m4(){
        return "Marathahalli";
    }
    public boolean m5(){
        return false;
    }
}

class Demo{
    public static void main(String[] args) {
        SavingAccount  s1 = new SavingAccount();
        s1.m1();       
        s1.m2();       
        s1.m3(); 
        System.out.println("Branch : "+ s1.m4());
        System.out.println(s1.m5());      
    }
}