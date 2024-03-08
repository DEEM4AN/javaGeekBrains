package sem03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {
        String p1 = "Земля";
        String p2 = "Уран";
        String p3 = "Венера";
        String p4 = "Нептун";
        String p5 = "Марс";
        String p6 = "Меркурий";
        String p7 = "Плутон";

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayNums = new ArrayList<>();
        ArrayList<String> arrayNames = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p5);
        arrayList.add(p6);
        arrayList.add(p7);

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            String p = iterator.next();

            if (!arrayNames.contains(p)) {
                arrayNames.add(p);
                arrayNums.add(1);
            } else {
                int index = arrayNames.indexOf(p);
                int count = arrayNums.get(index);
                arrayNums.set(index, count+1);
            }
        }
        for (int i = 0; i < arrayNames.size(); i++) {
            System.out.println(arrayNames.get(i) + ": " + arrayNums.get(i));
        }
        String s  = "";
        Iterator<String> iterator1 = arrayList.iterator();
        Collections.sort(arrayList);
        while (iterator1.hasNext()) {
            if (s.equals(iterator1.next())) {
                arrayList.remove(iterator1.next());
            }
            s = iterator1.next();
        }
        System.out.println(arrayList);
        
    }
}

