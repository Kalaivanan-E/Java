import java.util.*;

class Test9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.add(4); // UnsupportedOperationException
    }
}


class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        try{
            list.add(4);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}