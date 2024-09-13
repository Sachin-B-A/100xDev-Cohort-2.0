
import java.util.*;
// its a two ended list;
//remove and return that element;

class MyLinkedList{
    public static void main(String [] args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(20);
        l.add(45);
        l.addFirst(1);
        l.addLast(60);
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getFirst()); 
        System.out.println(l.getLast());
    }
}