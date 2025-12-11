
public class TestOne {
    public String toString(){
        return "Rajini";
    }
    public static void main(String[] args) {
        TestOne t1 = new TestOne();
        // System.out.println(t1);  //if we not override then object address printed(TestOne@3439f68d)
        System.out.println(t1); // Rajini
    }
}
