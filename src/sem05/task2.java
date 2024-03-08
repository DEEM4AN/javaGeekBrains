package sem05;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class task2 {
    /*
    Предположим, что есть список студентов,
    каждый из которых принадлежит к какой-то группе.
    Мы можем использовать HashMap, где ключом будет номер группы,
    а значением - количество студентов в этой группе
     */


    public static void main(String[] args) {
        String[] students = {"John", "Alice", "Bob", "Emily", "Jack", "Kate", "Michael", "Sophia", "Alex"};
        String[] groups = {"GroupA", "GroupB", "GroupA", "GroupC", "GroupB", "GroupC", "GroupA", "GroupB", "GroupC"};
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String group : groups) {
            hashMap.put(group, hashMap.getOrDefault(group, 0) + 1);
        }
        System.out.println(hashMap);
    }
}
