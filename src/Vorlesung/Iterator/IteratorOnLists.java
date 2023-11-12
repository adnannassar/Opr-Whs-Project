package Vorlesung.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOnLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int temp = it.next();
            if(temp == 2){
                System.out.println("FALSE");
            }
            System.out.println(temp);
        }
    }
}
