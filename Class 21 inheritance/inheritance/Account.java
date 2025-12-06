
public class Account extends Bank{
    String acc_Name;
    String acc_Email;
    public Account (String name, String email){
        this.acc_Email=email;
        this.acc_Name = name;
    }
    public void cal_bal(){
        System.out.println("Account method");
    }
}
