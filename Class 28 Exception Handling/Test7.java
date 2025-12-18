
// NumberFormatException
class Test7{
    public static void main(String[] args) {
        int num = Integer.parseInt("abc");
        System.out.println(num);
    }
}
class Test{
    public static void main(String[] args) {
        try{
             int num = Integer.parseInt("abc");
            System.out.println(num);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}