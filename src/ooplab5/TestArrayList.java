package ooplab5;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
//ArrayList
        ArrayList list = new ArrayList();
        list.add("FAR");
        list.add("NAM");
        list.add("MOOK");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1, "joy");
        System.out.println(list);
//print with for loop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }//for i
        System.out.println(list.indexOf("joy"));
        list.set(1, "BABY");
        System.out.println(list);








    }//main
}//class
