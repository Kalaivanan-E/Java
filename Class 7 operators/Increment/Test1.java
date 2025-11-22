 /* it show compile time error, because b is byte type and 1 is int, 
        while adding it will convert into int so it will show compile time error
 */        
class Test{

    public static void main(String[] args) {
        int a = 10;
        a = a+1;
        byte b = 10;
        b = b+1;  
        System.out.println(b);  // compile time error
        System.out.println(a);  // 11
    }
}

