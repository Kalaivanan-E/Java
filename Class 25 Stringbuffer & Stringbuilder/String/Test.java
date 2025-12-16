
 class Test {
    public static void main(String[] args) {
        String s1 = "Rahul";
        s1.concat("Gandhi");
        System.out.println(s1); // Rahul

        StringBuilder s2 = new StringBuilder("Rahul");
        s2.append("Gandhi");
        System.out.println(s2); // Rahul Gandhi
    }
}
