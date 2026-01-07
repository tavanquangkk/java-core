package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("hello");
        list.add("hello3");
        list.add("hello2");
        list.add("hello9333");
        list.add("hello6");

        list.sort(String::compareTo);

        List<String> list2 = list.subList(4,5);
        list2.add("added");
        for(String l : list ){
            System.out.println(l);
        }
        // list.remove(1); can't change(add,remove) list after use subList() , it will give us Exception in thread "main" java.util.ConcurrentModificationException
        for(String l : list2 ){
            System.out.println(l);
        }
    }
}