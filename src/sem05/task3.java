package sem05;

import java.util.HashMap;

public class task3 {
    /*
    Подсчет слов в строке:

Условие: Дана строка текста. Необходимо подсчитать количество вхождений каждого слова в этой строке.


Lorem ipsum dolor sit amet, consectetur adipiscing elit,
sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
Ut enim ad minim veniam, quis nostrud exercitation ullamco
laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit
in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat
non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
     */


    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] arrString = text.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s:
             arrString) {
            hashMap.put(s, hashMap.getOrDefault(s, 0)+1);
        }
        System.out.println(hashMap);
    }
}
