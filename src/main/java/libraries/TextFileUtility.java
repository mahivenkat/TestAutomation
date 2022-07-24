package libraries;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextFileUtility {

    public static void appendContentToTextFile(String content) throws IOException {
        File file = new File("C:\\Users\\Deepak Dontineni\\me\\untitled\\src\\test\\resources\\OutputData\\kundabaddalu2_0_subscribersNumbers.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write(content+"\n");
        fw.close();
    }

}
