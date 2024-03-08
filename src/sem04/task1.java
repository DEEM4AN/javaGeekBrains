package sem04;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        while (true) {
            String s = scanner.nextLine();
            String[] arrayString = s.split("~");
            int index = Integer.parseInt(arrayString[1]);
            String element = arrayString[0];
            if (element.equals("print") && index<linkedList.size()) {
                System.out.println(linkedList.remove(index));
            }
            if (linkedList.size() == 0 || linkedList.size() == index) {
                linkedList.add(element);
                continue;
            }
             else if (index < linkedList.size() && linkedList.get(index) == null) {
                linkedList.add(index, element);
            } else if (index < linkedList.size()) {
                linkedList.set(index, element);
            } else System.out.println("IO Error");
            System.out.println(linkedList);
        }
    }
}
