package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //located the file from files in our project.
       // String path="C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Config.properties";
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";//The get property gives us everything before files.
        //so now we dont need to hardcode just put in the beginning then file name then property name.

        //Moves the file from permanent storage into ram
        FileInputStream fis=new FileInputStream(path);
        //need this class to interact with file. Assists us to read and write data from the file.
        Properties properties=new Properties();
        //Loads the data from txt file into the properties object
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("URL"));
//code to access user directory.
        System.out.println(System.getProperty("user.dir"));
    }
}
