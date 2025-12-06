
interface Bank{
    // String calc_bal();
    String calc_bal();
}
class Account implements Bank{
    public String calc_bal(){
        return "Welcome to Bengaluru";
    }
}
class Demo{
    public static void main(String[] args) {
        // Account u1 = new Account();
        Bank u1 = new Account();
        System.out.println(u1.calc_bal());
    }
}