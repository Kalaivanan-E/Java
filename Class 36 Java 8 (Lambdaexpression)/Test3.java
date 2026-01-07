

interface calc{
    int add(int a, int b);
}
 class calcImpl{

    public static void main(String[] args) {
        calc c1 = (a,b)-> a+b;
        System.out.println(c1.add(10, 20));
    }
}