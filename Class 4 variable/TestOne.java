
// Static variable

class Test{
    int eid=101;
    String ename="Rahul";
    static String org_Name="TCS";
    public static void main(String[] args) {
        Test t1=new Test();

        System.out.println(t1.org_Name);  //using object
        System.out.println(Test.org_Name);//using class name
        System.out.println(org_Name);     //directly
    }
}