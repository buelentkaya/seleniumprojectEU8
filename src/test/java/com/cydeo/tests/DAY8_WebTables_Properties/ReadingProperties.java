package com.cydeo.tests.DAY8_WebTables_Properties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public  void readingFromPropertiesTest() throws IOException {
        //1-Create the object of properties

        Properties properties=new Properties();


        //2-We need to open the file in java memory
        FileInputStream fileInputStream=new FileInputStream("configuration.properties");

        //3-Load the properties object using FleINputStream object
        properties.load(fileInputStream);

        //4- Use properties object to read value
        properties.getProperty("browser");   // return us "chrome"

        properties.getProperty("env");    //return us the environment I work= https://login1.nextbasecrm.com

        properties.getProperty("username"); //return us the username=   helpdesk1@cydeo.com

    }







}
