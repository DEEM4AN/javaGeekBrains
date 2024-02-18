package sem02;

public class task3 {
    public static void main(String[] args) {
        /*/
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd.a4b3cd2 для примера
         */


        String s = "aaaabbbcdd";
        s += ".";
        String stringOut = "";
        int count = 1;
        for (int index = 0; index < s.length() - 1; index++) {
            if (s.charAt(index + 1) != s.charAt(index)) {
                stringOut += s.charAt(index) + String.valueOf(count);
                count = 0;
            }
            count++;
        }
        System.out.println(stringOut);
    }
}

