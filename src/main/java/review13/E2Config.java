package review13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args)  {
        String path="C:\\Users\\Ren7e\\IdeaProjects\\Java project\\Files\\Config.properties";
       try{FileInputStream fis=new FileInputStream(path);
           Properties properties=new Properties();
           properties.load(fis);
           System.out.println(properties.getProperty("browser"));

       }catch (IOException e){//covers both exeptions of properties and fileinputstream
           System.out.println("Please check the file that you are trying to read");
       }

    }
}
