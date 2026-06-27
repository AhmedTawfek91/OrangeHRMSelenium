package FileReaders;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    Properties property;

    public PropertiesFileReader()
    {
        this.property = new Properties();
        readPropFile();
    }

    private void readPropFile()
    {

        try{
            FileInputStream file = new FileInputStream("src/main/resources/ExternalFiles/Credentials.properties");
            property.load(file);
        }
        catch (IOException e)
        {
            System.out.println("File path not found: " + e.getMessage());
        }
    }

    public String getProperty(String key)
    {
        return property.getProperty(key);
    }
}
