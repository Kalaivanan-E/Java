

// with lambda expression
// how to execute lambda expression? by using functional interface
interface FunctionI{
    public abstract int apply(String name);
}
class TestTwo {
    public static void main(String[] args) {
        FunctionI t1 = (name)->name.length();
        System.out.println(t1.apply("Rahul"));
    }
}