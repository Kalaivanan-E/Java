

// class Object{
//     public  boolean equals(Object o){
//         return true/false;
//     }

// }
class Employee extends Object{
    public static void main(String[] args) {
        Employee e1 = new Employee();

        Employee e2 = new Employee();

        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());  // Employee@123433
        String s1 = "Rahul";
        String s2 = "Rahul";
        System.out.println(s1.equals(s2));
    }
}