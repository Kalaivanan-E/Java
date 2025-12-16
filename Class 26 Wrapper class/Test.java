

class Test{
    public static void main(String[] args) {
        int a = 100;
        Integer b = 100;
        Integer c = 100;

        System.out.println(a);
        System.out.println(b);
        // System.err.println(a.equals(b)); // a is primitive datatype not applicable for equals method.
        System.out.println(b.equals(c));
    }
}