package sem02;

import java.util.Scanner;



/*/
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N,
которая состоит из чередующихся символов c1 и c2,
начиная с c1.
 */

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String c1 = "a";
        String c2 = "b";
        String res = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 2; i < N; i++) {
            res = stringBuilder.append(c1).append(c2).toString();
        }
        System.out.println(res);
    }
}
