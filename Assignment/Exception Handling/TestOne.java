
// nullpointer exception 
// without handling
class TestOne{
    public static void main(String[] args) {
        String s1 = null;
        System.out.println(s1.length());
        System.err.println("Good Morning");
    }
}

// with handling exception

class Test{
    public static void main(String[] args) {
        try{
            String s1 = null;
            System.out.println(s1.length());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.err.println("Good Morning");
    }
}

