
class Test{
    public static void main(String[] args) {
        SA sa1 = new SA(101,"Rahul","Rahul@gmail.com",5000.00);
        CA ca1 = new CA(1001,"Sonia","Sonai@gmail.com",10000.00);
        // System.out.println(sa1.cal_Bal());
        // System.out.println(ca1.cal_Bal());
        System.out.println(AccountService.getService(sa1));
        System.out.println(AccountService.getService(ca1));

    }
}