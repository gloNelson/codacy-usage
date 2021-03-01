package Close;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

public class Example3 {
    public static void main(String[] args) {
        OutputStream fos = null;
        try {
            fos = new FileOutputStream("myFile.txt");
            fos.write(1);
        } catch (Exception e) {
            System.exit(2);
        } finally {
            if (fos != System.out) {
                IOUtils.closeQuietly(fos);
            }
        }
    }
}
