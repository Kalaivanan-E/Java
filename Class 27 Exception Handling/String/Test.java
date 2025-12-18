package String;

// autoboxing and unboxing

class Test{
    public static void main(String[] args) {
        Integer a = 100;  // autoboxing
        int b = a;  // unboxing
        Double esal = 45000.45;  // autoboxing
        double sal = esal;   // unboxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(esal);
        System.out.println(sal);

/*      internal working of autoboxing and unboxing

        Integer a = Integer.valueOf(100); // internal working of autoboxing
        int b = a.intValue();  // internal working of unboxing
        Double esal = Double.valueOf(45000.45);
        double sal = esal.doubleValue(); */
    }
}