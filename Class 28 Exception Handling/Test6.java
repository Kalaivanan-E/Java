
// StringIndexOutofBoundException
class Test6{
    public static void main(String[] args) {
        String s ="kalai";
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(10)); 
    }
}

class Test{
    public static void main(String[] args) {
        String s = "kalai";
        System.out.println(s.charAt(0));
        try{
            System.out.println(s.charAt(10));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}