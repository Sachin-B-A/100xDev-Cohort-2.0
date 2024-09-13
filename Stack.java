import java.util.*;

// LIFO
// It has TOP : Here called peek
// Whenever need LIFO use Stack/Arraylist

class MyStack{
    public static void main(String args[]){
        Stack <Integer> s= new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        s.push(40);
        System.out.println(s.peek());// Returns top element of a stack
        System.out.println(s);
        System.out.println(s.isEmpty());      
    }
}