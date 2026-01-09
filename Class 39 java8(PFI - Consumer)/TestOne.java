import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface FunctionOne {
    int apply(List<?> enames);
}

@FunctionalInterface
interface PredicateOne {
    boolean test(List<?> enames);
}

@FunctionalInterface
interface ConsumerOne {
    void accept(List<?> enames);
}

public class TestOne {
    public static void main(String[] args) {

        List<String> enames = Arrays.asList("RG", "SG", "PG", "Modi");

        // Custom Functional Interfaces
        FunctionOne f1 = names1 -> names1.size();
        PredicateOne p1 = names1 -> names1.isEmpty();
        ConsumerOne c1 = names1 -> {
            for (Object ename : names1) {
                System.out.println(ename);
            }
        };

        // Built-in Functional Interfaces
        Function<List<String>, Integer> f2 = names1 -> names1.size();
        Predicate<List<String>> p2 = names1 -> names1.isEmpty();
        Consumer<List<String>> c2 = names -> {
            for (String name : names) {
                System.out.println(name);
            }
        };

        // Execution
        c1.accept(enames);
        c2.accept(enames);

        System.out.println(f1.apply(enames));
        System.out.println(f2.apply(enames));

        System.out.println(p1.test(enames));
        System.out.println(p2.test(enames));
    }
}
