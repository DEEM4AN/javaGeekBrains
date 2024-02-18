package sem02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class logger {
    public static void main(String[] args) {
//        String s1 = "hello ";
//        String s2 = "java";
//        System.out.println(s1 + s2);
//        StringBuilder builder = new StringBuilder();
//        System.out.println(builder.append(s1).replace(2,4, "hi"));
//        StringBuffer stringBuffer = new StringBuffer();
//        Logger logger = Logger.getAnonymousLogger();
//        int a = 8;
//        int b = 0;
//        try {
//            FileWriter fileWriter = new FileWriter("text.txt");
//            fileWriter.write("I love and hate java!");
//            System.out.println("file wrote successfully");
//            logger.info("try block");
//           int  c= a/b;
//            fileWriter.close();
//        } catch (Exception e) {
//            logger.warning("err!");
//            System.out.println("divide by zero here! ");
//        }

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {
            // Указываем путь к файлу логов и инициализируем объект FileHandler
            fh = new FileHandler("mylog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // Примеры логирования разных уровней
            logger.info("Информационное сообщение");
            logger.warning("Предупреждение");
            logger.severe("Сообщение об ошибке");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}