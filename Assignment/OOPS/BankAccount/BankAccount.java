
class BankAccount{

    private long accountNumber;
    private String name;
    private double balance;

    BankAccount(long acc_no, String name, double balance){
        this.accountNumber = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount){
        balance = balance + amount;
        return balance;
    }
    public double withdraw(double amount){
        if(amount<=balance){
             balance = balance - amount;
        }
        return balance;       
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(1234567, "Kalai", 5000.00);
        System.out.println(ba1.deposit(5000.00));
        System.out.println(ba1.withdraw(5000.00));
        System.out.println(ba1.getBalance());
    }
}