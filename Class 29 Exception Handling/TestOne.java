import java.io.*;

class Testone{
    public static void main(String[] args){

        try{
            PrintWriter pw = new PrintWriter("abc.txt");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
