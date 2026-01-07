import java.util.Optional;

// to avoid nullpointerexception we use optional class

public class Test2 {

    public static void main(String[] args) {
        // String s2 = "Rahul";
        String s2 = null;
        Optional<String> opt = Optional.ofNullable(s2);
        if (opt.isPresent()) {
            System.out.println(opt.get().toLowerCase());
        }
        else{
            System.out.println("String value Null");
        }
    }
}

class Test3 {
        public static void main(String[] args) {
        // String s2 = "Rahul";
        String s2 = null;
        Optional<String> opt = Optional.of(s2);
        if (opt.ifPresent()) {
            System.out.println(opt.get().toLowerCase());
        }
        else{
            System.out.println("String value Null");
        }
    }
}