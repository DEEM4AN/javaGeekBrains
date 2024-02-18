package sem02;

import java.io.FileWriter;
import java.io.IOException;

public class task5 {


    /*/
    Напишите метод,
    который составит строку,
    состоящую из 100 повторений слова TEST и метод,
    который запишет эту строку в простой текстовый файл,
    обработайте исключения.
     */


    public static void main(String[] args) throws IOException {
        String s = "TEST ";
        FileWriter fileWriter = new FileWriter("text.txt");
        String s100 = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <101 ; i++) {
            s100 = builder.append(s).toString();
        }
        System.out.println(s100);

        try{
            fileWriter.write(s100);
            fileWriter.flush();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
