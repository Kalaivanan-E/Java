

//consumer is predefined functional interface, it get only input and method called accept

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;

class TestOne{
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG","SG","PG");
        Consumer<List> c = (names)-> {
            for(Object ename: names){
                System.out.println(ename);
            }
        };
        c.accept(enames);
    }
}

// userdefined without lambdaexpression

interface consumerone{
    void accept(List enames);
}
class TestTwo implements consumerone{
    public void accept(List enames){
        for(Object ename:enames){
            System.out.println(ename);
        }
    }
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG","SG","PG");
        consumerone c1 = new TestTwo();
        c1.accept(enames);

    }
}
// with lambdaexpression

class TestThree{
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG","SG","PG");
        consumerone c1 = ename ->{
            for(Object name: enames){
                System.out.println(name);
            }
        };
        c1.accept(enames);
    }
}