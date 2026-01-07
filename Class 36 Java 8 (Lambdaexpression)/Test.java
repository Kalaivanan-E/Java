
// without Lambda Expression
interface FIOne{
    public abstract int get();
}
class FIimpl implements FIOne{
    public int get(){
        return 100;
    }
    public static void main(String[] args) {
        FIimpl fi = new FIimpl();
        System.out.println(fi.get());
    }
}