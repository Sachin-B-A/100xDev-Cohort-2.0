
import java.util.TreeSet;
//Stores unique elements in sorted order
// Hence take O(log n) 

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(5);
        ts.add(15);
        System.out.println(ts);
        System.out.println(ts.floor(5));
        System.out.println(ts.ceiling(5));
        System.out.println(ts.floor(6)); //<=6 First value less than 6
        System.out.println(ts.ceiling(6));// >=6 First value greater than 6
        
        // for (var i : ts) {
        //     System.out.println(i);
        // }
    }
}