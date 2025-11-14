// given number is three digit or not

class Test{
    public static void main(String[] args) {
        int num = 341;
        if(num>=100 && num <=999){
            System.out.println("The given number is 3 digits");
        }
        else{
            System.out.println("The given number is not 3 digit");
        }
    }
}