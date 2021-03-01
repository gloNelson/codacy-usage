package Close;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.googlecode.lanterna.gui2.AbstractTextGUI;

public class Example1 {
    public static Properties loadPropTheme(String resourceFileName) {
        Properties properties = new Properties();
        try {
            ClassLoader classLoader = AbstractTextGUI.class.getClassLoader();
            InputStream resourceAsStream = classLoader.getResourceAsStream(resourceFileName);
            if(resourceAsStream == null) {
                resourceAsStream = new FileInputStream("src/main/resources/" + resourceFileName);
            }
            properties.load(resourceAsStream);
            resourceAsStream.close();
            return properties;
        }
        catch(IOException e) {
            // Failed to load theme, return null
            return null;
        }
    }
}
