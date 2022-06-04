package com.cydeo.tests.day9_javaFaker_Testbase_DriverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 2)
    public  void singletonUnderstaningTest1(){
        String str1=Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2=Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3=Singleton.getWord();
        System.out.println("str3 = " + str3);
//First time call.Word object is null.Assigning value to it now.
//str1 = something
//Word already has value
//str2 = something
//Word already has value
//str3 = something

    }

    @Test (priority = 1)
    public  void singletonUnderstaningTest2(){
        String str4=Singleton.getWord();
        System.out.println("str4 = " + str4);
    }




}
