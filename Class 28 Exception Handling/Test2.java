//unexpected events occurs program terminate abnormally
// ArrayIndexOutofBound exception

public class Test2 {

    public static void main(String[] args) {
        int [] eids = {101,102,103,104};
        System.out.println(eids[1]);
        System.out.println(eids[8]);
        System.out.println(eids[0]);
        System.out.println("Good Morning");
    }
}
class Test{
    public static void main(String[] args) {
         int [] eids = {101,102,103,104};
        System.out.println(eids[1]);
        try{
            System.out.println(eids[8]);
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(eids[0]);
        System.out.println("Good Morning");
    }
}