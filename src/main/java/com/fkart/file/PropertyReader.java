package com.fkart.file;

import java.io.*;
import java.util.Properties;

public class PropertyReader {

    //private final String basePath = "src/main/resources";
    private static String configFilePath = "src/main/resources/config.properties";

    public static String getValue() throws IOException {

        Properties properties = new Properties();
        File file = new File(configFilePath);
        FileInputStream fis = new FileInputStream(file);
        properties.load(fis);
        return properties.getProperty("baseUrl");
    }
}






//   // public static String getProperty(String key) {
//        return properties.getProperty(key);
//    }
//
//}
