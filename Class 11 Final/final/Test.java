// final is applicable for variable, class, method
// if variable is declared as  final we can't update/modified
// if class is declared as final we can't declare child class, inheritance is not possible
 class Test {
     public static void main(String[] args) {
        final int eid=101;
        // eid=102;
        System.out.println("Employee Id:"+ eid);
    }
}
