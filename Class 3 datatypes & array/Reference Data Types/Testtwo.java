
public class Testtwo {

    public static void main(String[] args){
        // Array Declaration
        int [] eids;
        // Array Creation
        eids = new int[4];
        // Array Initilization
        eids[0] =101;
        eids[1] =102;
        eids[2] =103;
        eids[3] =104;
        // Read array and Array elements - Indexing
        System.out.println(eids);   // [I@11e21d0e
        System.out.println(eids[0]);   //101 
        System.out.println(eids[1]);   //102 
        System.out.println(eids[2]);   //103 
        System.out.println(eids[3]);   //104 
        System.out.println(eids[4]);   // Index 4 out of bound
    } 
}

