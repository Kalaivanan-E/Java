/* class TestOne{
    public static void main(String[] args) {
        TestOne obj=new TestOne();
        System.out.println(obj); // TestOne@6366ebe0
    }
} */

abstract class TestOne{
    public static void main(String[] args) {
        TestOne obj=new TestOne();
        System.out.println(obj);  // if the access modifier is abstract then we can't create a object.
    }
}