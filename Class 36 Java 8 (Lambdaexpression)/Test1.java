

// lambda expression

interface FItwo{
    public abstract int get();
}
public class Test1 {


    public static void main(String[] args) {

      FItwo fi =()->100;
      System.out.println(fi.get());
    }
}