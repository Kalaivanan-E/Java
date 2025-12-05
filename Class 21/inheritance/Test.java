
public class Test {
    public static void main(String[] args) {
        Saving_Account sa1 = new Saving_Account(101,"Rahul", "rahul@gmail.com", 5000.00);
        sa1.setMin_Bal(500.00);
        sa1.cal_bal();
        Current_Account ca1 = new Current_Account(102, "Sonia", "Sonia@gmail.com", 10000.00);
        System.out.println("Deposit amount : "+ ca1.acc_Bal);
        ca1.setMin_Bal(5000.00);
        ca1.cal_bal();
     }
}
