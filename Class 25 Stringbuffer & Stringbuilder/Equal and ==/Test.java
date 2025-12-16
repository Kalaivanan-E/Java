
class User{

}
class Emp extends User{

}

class Test{
    public static void main(String[] args) {
        User u1 = new User();
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        String s1 = new String("Rahul");
        String s2 = "Rahul";
        String s3 = new String("Gandhi");
        String s4 = "Rahul Gandhi";
        System.out.println(u1.equals(e1)); // false
        System.out.println(u1.equals(s1)); // false
        // System.out.println(u1 == s1); // compile time error, if we want to compare object using == then relation is required
        System.out.println(u1 == e1);
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2));
        
    }
}