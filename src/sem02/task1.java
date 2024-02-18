package sem02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class task1 {
    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        String s = "hello";
        String s2 = "java";
        System.out.println(builder.append(s).append(s2).replace(2, 4, "jo"));
        Logger logger = Logger.getAnonymousLogger();
        int a = 8;
        int b = 0;

        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("I love and hate java");
            logger.info("try block");
            fileWriter.close();
        } catch (Exception ds) {
            logger.warning("err");
            System.out.println("ERROR");
        }

    }
}
