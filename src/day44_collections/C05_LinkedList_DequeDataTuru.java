package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        //Double ended Q==Deque
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Tevfik");
        ll4.add("Akin");
        System.out.println("ll4 = " + ll4);//ll4 = [Cavidan, Mesut, Tevfik, Akin]
        System.out.println("ll4.pop() = " + ll4.pop());//ll4.pop() = Cavidan
        System.out.println("ll4.removeLastOccurrence() = " + ll4.removeLastOccurrence("Mesut"));//ll4.removeLastOccurrence() = true
        System.out.println("ll4 = " + ll4);//ll4 = [Tevfik, Akin]
        ll4.push("Alkan");
        System.out.println("ll4 = " + ll4);//ll4 = [Alkan, Tevfik, Akin]



    }
}
