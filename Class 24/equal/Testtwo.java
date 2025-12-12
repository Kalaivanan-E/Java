

class Test{
    public static void main(String[] args) {
        
        String s1 = new String("Rahul");
        String s2 = "Rahul";
        String s3 = new String("Gandhi");
        String s4 = "Rahul";

        System.out.println(s4.equals(s1)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1 == s4 );  // false
        System.out.println(s2 == s4);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s1 == s2);  // false
    }
}