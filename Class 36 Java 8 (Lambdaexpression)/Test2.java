


interface calc{
    public abstract int add(int a, int b);
}

class calcImpl implements calc{
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        calc c1 = new calcImpl();

        System.out.println(c1.add(10, 20));
    }
}