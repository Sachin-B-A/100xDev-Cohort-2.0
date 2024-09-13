// It stores unique data in the form of sorted order 
//TC: O(1)
import java.util.*;

class MyHashset{
    public static void main(String [] args){
        HashSet <Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        hs.add(0);
// Note: Doesn't guarantee to be in the form of sorted order.
        System.out.println(hs);
        for (var i : hs) {
            System.out.println(i + "");
        }
    }
}