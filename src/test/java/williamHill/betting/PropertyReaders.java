package williamHill.betting;

/**
 * Created by dbharti on 21/03/2017.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReaders {


    Properties properties = new Properties();
    InputStream inputStream = null;

    public PropertyReaders() {
        loadProperties();
    }

    private void loadProperties() {
        try {
            inputStream = new FileInputStream("src/config.properties");//it'll get the browser name mentioned in the property
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readProperty(String key) {
        return properties.getProperty(key);
    }
}

