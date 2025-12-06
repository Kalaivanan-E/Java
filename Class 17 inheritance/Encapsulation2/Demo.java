
public class Demo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEid(101);
        e1.setEname("Rahul");
        e1.setLoc("Bangalore");
        e1.setAvail(true);
        System.out.println(e1.getEid());
        System.out.println(e1.getEname());
        System.out.println(e1.getLoc());
        System.out.println(e1.isAvail());
    }
}