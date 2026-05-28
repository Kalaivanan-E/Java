

// predefined functional interface

import java.util.*;
import java.util.function.Function;

interface Function2{
    public abstract int apply(List enames);
}

class TestFour{
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("rg","sg","pg");
        Function<List,Integer> t1 = name -> name.size();

        Function2 t2 = name1 -> name1.size();

        System.out.println(t1.apply(enames));
        System.out.println(t2.apply(enames));
    }
}