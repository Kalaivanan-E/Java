
// without lambda expression

import java.util.function.Predicate;

interface PredicateOne{
    public abstract boolean test(String ename);
}
class Test implements PredicateOne{
    public boolean test(String ename){
        return ename.length()>=5;
    }
    public static void main(String[] args) {
        PredicateOne p1 = new Test();
        System.out.println(p1.test("Rahul"));
        System.out.println(p1.test("maha"));
    }
}

//with lambda expression

interface PredicateTwo{
    public abstract boolean test(String ename);
}
class TestTwo{
    public static void main(String[] args) {
        PredicateTwo p2 = name -> name.length()>=5;
        System.out.println(p2.test("Rahul Gandhi"));
        System.out.println(p2.test("Kalaivanan"));
    }
}

//predefined FI and lambda expression

class TestThree{
    public static void main(String[] args) {
        Predicate<String> p3 = ename -> ename.length()>=5;
        System.out.println(p3.test("RahulGandhi"));
        System.out.println(p3.test("Mahi"));
    }
}