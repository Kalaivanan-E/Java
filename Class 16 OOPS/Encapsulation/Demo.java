

class Demo{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setAcc_id(101);
        a1.setAcc_name("Rahul");
        a1.setAcc_bal(5000);
        System.out.println(a1.getAcc_id()); // 101
        System.out.println(a1.getAcc_name()); // Rahul
        System.out.println(a1.getAcc_bal());  // 5000
    }
}