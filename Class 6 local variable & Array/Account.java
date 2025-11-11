/* 
    when to use instance variable ==> when variable values is varied from object to object 
                                        then we can use instance variable
    When to use static variable ==> when variable value is not varied from object to object,
                                        then we can use static variable
 */

class Account{
    // instance variable
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    //static variable
    static String bank_Name;
    static String branch_Name;
    public static void main(String[] args){
    Account a1 = new Account();
    a1.acc_Id = 101;
    a1.acc_Name = "Rahul";
    a1.acc_Bal = 45000.25;
    Account a2 = new Account();
    Account a3 = new Account();
    System.out.println(a1.acc_Id);// 101
    System.out.println(a2.acc_Id);// 0
    System.out.println(a3.acc_Id);// 0
    System.out.println(a3.bank_Name); // null
    System.out.println(a1.bank_Name); // null
    System.out.println(a1.acc_Bal); // 45000.25
    }

}