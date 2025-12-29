
// ArrayList 

import java.util.ArrayList;
class Test{
    public static void main(String[] args) {
        
        // ArrayList eids = new ArrayList();   // here we will get warning "Unchecked or unsafe operation,
        //  to avoid we use generic"
         ArrayList<Integer> eids = new ArrayList<Integer>();
        System.out.println(eids); // []
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        System.out.println(eids); // [101,102,103,104]
    }
}