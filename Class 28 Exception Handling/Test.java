// unexpected events occurs program terminate abnormally

// Arithmetic exception
class Test1{
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0);  
        System.out.println(10/1);
        System.out.println("Good Morning");
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(10/2);
        try{
             System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
         
        System.out.println(10/1);
        System.out.println("Good Morning");
    }
}
