package com.flipkart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

//In this class we are going to creating the re-sable logic to read the file from configuration.properties file

        //1.Create object of Properties
        private static Properties properties = new Properties();

        static {                           //this is a static block
            try {                          //we handle both exception at the same time
//2.We need to open the file in the Java memory
                FileInputStream file = new FileInputStream("configuration.properties");
                properties.load(file);
//close the file in the memory
                file.close();
            } catch (IOException e) {
                System.out.println("FILE NOT FOUND WITH GIVEN PATH");
                e.printStackTrace();
            }
        }

        //Create a utility method to use the object to read
        public static String getProperty(String keyword) {
            return properties.getProperty(keyword);
        }
    }

