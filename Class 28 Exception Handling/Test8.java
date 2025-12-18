
//NegativeArraySizeException
public class Test8 {
    public static void main(String[] args) {
        int size =-5;
        int [] arr = new int[size];
    }
}

class Test{
    public static void main(String[] args) {
        try{
        int size =-5;
        int [] arr = new int[size];
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
