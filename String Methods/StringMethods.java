import java.util.*;
import java.lang.*;
class StringMethods{
    public static void main(String[] args) {
        String str = "Hello JavaProgram!";
        System.out.println(str.length());  //19
        System.out.println(str.charAt(0)); // H
        System.out.println(str.indexOf("J")); // it will return the index of first occurence of given character
        System.out.println(str.lastIndexOf("g"));// it will come from the last 
        System.out.println(str.startsWith("Hello")); // true
        System.out.println(str.endsWith("!")); // true
        System.out.println(str.substring(7)); // JavaProgram!
        System.out.println(str.substring(7,11)); // Java
        System.out.println(str.replace("a", "o")); // hello Jovoprogrom
        System.out.println(str.toUpperCase()); //  HELLO JAVAPROGRAM
        System.out.println(str.toLowerCase()); // hello javaprogram
        System.out.println(str.isEmpty());  // false
        System.out.println(str.equals("hello javaprogram!")); // false
        System.out.println(str.equalsIgnoreCase("hello javaprogram!")); // true
        System.out.println(str.concat("by program proof")); // Hello JavaProgram! by program proof
        System.out.println(str.trim());  // it will remove empty space from behind and backword
        char[] ch = str.toCharArray();
        System.out.println(ch);
    }
}