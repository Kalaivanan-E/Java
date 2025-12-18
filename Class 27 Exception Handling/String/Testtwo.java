package String;

class Testtwo{
    public static void main(String[] args) {
        // string to primitive data type - using parse method
        int a = Integer.parseInt(args[0]);

        // string to object type - using valueOf method
        Integer b = Integer.valueOf(args[1]);
        System.out.println(a+b);
    }
}