

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList <Integer> eids = new LinkedList<>();
        eids.add(105);
        eids.add(101);
        eids.add(103);
        eids.add(102);
        eids.add(104);

        for(Integer eid : eids){
            System.out.println(eid);
        }

        Collections.sort(eids);
        System.out.println(eids);
    }
}
