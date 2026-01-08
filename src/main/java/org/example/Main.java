package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("learn linked list");
//    linked list có hai con trỏ lưu địa chỉ của phần tử trước và sau
//    ưu điểm: thêm và xoá phần tử nhanh ở đầu và cuối danh sách
//        chèn nhanh hơn chỉ cần thay đổi liên kêts không ảnh hương đến chỉ mục của các phần tử khác
//    nhược điểm: truy cập phần tử chậm hơn so với ArrayList

        LinkedList<String> list = new LinkedList();
        list.addLast("lasted");
        list.add("Cam");
        list.add("Chanh");
        list.add("Dao");
        list.add("chuoi");
        list.addFirst("cam nho");
        for(String e : list){
            System.out.println(e);
        }
        list.add(4,"222");
        System.out.println("======");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
/*
* câu hỏi phỏng vấn linkedlist
* so sánh arraylist
* doubly linked và singly linked khác nhau thể nào ? java linkedlist thuộc loại nào?
* linkedlist có hỗ trợ truy cập ngẫu nhiên không
* làm sao để an toàn khi dùng đa luồng
* thời gian thực thi thêm xoá phần tử đầu cuối
*
*
* nâng cao tự thiết kế linkedlist thế nào ?
* tối ưu hoá bộ nhớ
* triển khai stack và queue bằng LinkedList
*
*
* */

//        List<String> list = new ArrayList();
//        list.add("hello");
//        list.add("hello3");
//        list.add("hello2");
//        list.add("hello9333");
//        list.add("hello6");
//
//        list.sort(String::compareTo);
//
//        List<String> list2 = list.subList(4,5);
//        list2.add("added");
//        for(String l : list ){
//            System.out.println(l);
//        }
//        // list.remove(1); can't change(add,remove) list after use subList() , it will give us Exception in thread "main" java.util.ConcurrentModificationException
//        for(String l : list2 ){
//            System.out.println(l);
//        }
    }
}