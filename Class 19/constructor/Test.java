
// constructor is special method in java  to initialize object values
// constructor will executes only once automatically at the time of object creation.
// we should write constructor using class Name.
// this is pointer pointing to current object

class Account{
    int acc_Id;       //instance variable
    String acc_Name; // instance variable
    double acc_Bal;  // instance variable
    Account(int id, String name, double amount){
        this.acc_Id= id;
        this.acc_Name = name;
        this.acc_Bal = amount;
    }
    public void open_Acc(){
        System.out.println("Account opened");
    }
    public static void main(String[] args) {
        Account a1 = new Account(101,"Rahul",5000);
        Account a2 = new Account(102,"Priya",6000);
        // Account a3 = new Account();
        System.out.println(a1.acc_Id);
        System.out.println(a1.acc_Name);
        System.out.println(a1.acc_Bal);
        System.out.println(a2.acc_Id);
        System.out.println(a2.acc_Name);
        System.out.println(a2.acc_Bal);
    }

}


