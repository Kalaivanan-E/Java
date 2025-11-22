
class Test{
    public static void main(String[] args) {
        int a = 10;
        int b = a++;  // post first assign the value then increment by 1
        System.out.println(a);  // 11
        System.out.println(b); //10
    }
}

class Test1{
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;  // prefix first increment by i and then assign
        System.out.println(a);  // 11
        System.out.println(b); //11
    }
}