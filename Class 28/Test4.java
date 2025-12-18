//unexpected events occurs program terminate abnormally
// nullpointerexception

class Test4{
    public static void main(String[] args) {
        String ename = null;
        System.out.println(ename.length());
    }
}
class Test{
    public static void main(String[] args) {
        
        try{
            String ename = null;
            System.out.println(ename.length());
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Good Morning");
        
    }
}