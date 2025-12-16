

// with autoboxing and unboxing

class Testtwo{
    public static void main(String[] args) {
        int a = 100;  // primitive DT
        Integer b = a;  // autoboxing
        int c = b;    // unboxing
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

// without autoboxing and unboxing
class Testthree{
    public static void main(String[] args) {
        int a = 100;
        Integer b = Integer.valueOf(a);
        int c = b.intValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
