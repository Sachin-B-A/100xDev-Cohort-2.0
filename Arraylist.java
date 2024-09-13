import java.util.*;
// Use import java.util.*, Everything
// Collection Interface
// Is extended by list interface, Hence all these methods are inherited.
//Dynamic Size not like array.
//One ended list;

public class arrayList{

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al.size());
        System.out.println(al.get(2));
        System.out.println(al.remove(3));// Remove element in given index, and return value;
        System.out.println(al.contains(30));// Check whether the list contains the given element
        al.add(1,25);
        System.out.println(al);
        al.clear();// Clear everything;
    }
}
