// Same ArrayList , industries we use Vector more bcz thread safe;

import java.util.*;

class Myvector{
    public static void main(String[] args){
        Vector <Integer> vc= new Vector<>(5);
        //Can intialize vector size or maynot also
        vc.add(10);
        vc.add(20);
        vc.add(30);
        vc.remove(2);
        System.out.println(vc.capacity());
        // Capacity: Amount of space internally allocated by Vector for storing element, if not specified it takes 10;
        System.out.println(vc);
    }
}