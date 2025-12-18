//unexpected events occurs program terminate abnormally
// illegalArgumentexception

public class Test5 {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setPriority(500);
        System.out.println("Good Morning");
    }
}

 class Test {
    public static void main(String[] args) {
        Thread t = new Thread();
        try{
            t.setPriority(500);
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("Good Morning");
    }
}
