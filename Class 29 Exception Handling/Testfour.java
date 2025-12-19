
class Test{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);  // code is generating exception
     // throw new ArithmeticException("weedend vibe started");  // user throw exception to JVM
        }catch(NullPointerException ne){
            System.out.println(ne.getMessage());
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.err.println("Good Morning");
    }
}