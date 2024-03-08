package sem06;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class task1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(0,24);
            set.add(array[i]);
        }
        double result = set.size() * 100 / array.length;
        System.out.println(result + "%");
//
        for (int item: set){
            int count = 0;
            for (int i = 0; i < 1000; i++) {
                if (array[i] == item){
                    count++;
                }
            }
            System.out.println(item +" "+count/10 + "%");
        }
    }
}
