package sem02;

import java.util.Scanner;

public class task4 {

    /*/
    Напишите метод,
    который принимает на вход
    строку (String) и
    определяет является
    ли строка палиндромом
    (возвращает boolean значение).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print text here:");
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < input.length() / 2; i ++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) flag = false;
        }
        if (flag) System.out.println("It's true");
        else System.out.println("It's false");
    }
}
