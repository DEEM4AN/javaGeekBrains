package sem04;

import java.util.*;


public class task2 {
    static void methodStack(ArrayList arrayList) {
        Stack stack = new Stack();
        for (int i = 0; i < arrayList.size(); i++) {
            stack.add(arrayList.get(i));
        }
        System.out.println(stack);
    }

    static void methodQueue(ArrayList arrayList) {
        Queue queue = new LinkedList();
        for (int i = 0; i < arrayList.size(); i++) {
            queue.add(arrayList.get(i));
        }
        System.out.println(queue);
    }

    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
            arrayList1.add(random.nextInt(1,100));
        }
        System.out.println(arrayList1);
        methodStack(arrayList1);
        methodQueue(arrayList1);
    }
}
