class Test{
    public static void main(String[] args) {
        // create a array 
        int [] eids = {101,102,103,104,105};
        // read a array ==> how to read array elements ? =using indexing
        System.out.println(eids[0]);// 101
        System.out.println(eids[1]);// 102
        System.out.println(eids[2]);// 103
        System.out.println(eids[10]);// index out of bound exception
    }
}