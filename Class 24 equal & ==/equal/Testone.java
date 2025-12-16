
class Employee{

}

class Testone{
    public static void main(String[] args) {
        
        String s1 = "Rahul";
        String s2 = new String("Rahul");
        String s3 = new String("Gandhi");

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        int a = 100;
        int b = 200;
        int c = 100;

        System.out.println(e1.equals(e2)); //false
        System.out.println(s1.equals(s2));  // true, here it check only content
        System.out.println(s1.equals(s3));  // false, s1 and s3 content are different
        // System.out.println(a.equals(b)); // compile time because equal() applicable only for object
        System.out.println(a == b); // false
        System.out.println(a == c); // true // for primitive data type it will check only content
        System.out.println(s1==s2); // false // for object it will check memory address
        System.out.println();


    }

}