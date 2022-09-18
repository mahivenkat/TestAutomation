package libraries;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextFileUtility {

    public static void appendContentToTextFile(String content) throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\OutputData\\kundabaddalu2_0_subscribersNumbers.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write(content+"\n");
        fw.close();
    }

    public static void readContentToTextFile(String content) throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\OutputData\\kundabaddalu2_0_subscribersNumbers.txt");
        FileReader fw = new FileReader(file);
        fw.read();
        fw.close();
    }

}
