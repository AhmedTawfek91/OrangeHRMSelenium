package Utils;

import FileReaders.PropertiesFileReader;

public class Environments {

    static PropertiesFileReader propertiesFileReader = new PropertiesFileReader();
    public static String BASE_URL = propertiesFileReader.getProperty("ORANGEHRM_BASE_URL");
    public static String LOGIN_USER_NAME = propertiesFileReader.getProperty("ORANGEHRM_LOGIN_USER_NAME");
    public static String LOGIN_PASSWORD = propertiesFileReader.getProperty("ORANGEHRM_LOGIN_PASSWORD");
}
