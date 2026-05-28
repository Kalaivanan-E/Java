

// predefined Functional Interface
// Function = one input and one output (Syntax ==> Function<T,R> T1 = ()->{}) T-Input,R-returntype

import java.util.function.Function;

class TestThree{
    public static void main(String[] args) {
        Function<String,Integer> t1 = name -> name.length();
        System.out.println(t1.apply("Rahul"));
    }
}