// while compiling JVM except Main method, if main method is not there then it won't compile
// if the class is public then the class name and file should be same



class Test {
    static int eid = 100;
    public static void main(String[] args){
        System.out.println(eid);
    }    
}
