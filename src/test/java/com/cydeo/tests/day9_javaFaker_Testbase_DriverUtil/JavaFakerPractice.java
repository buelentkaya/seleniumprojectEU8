package com.cydeo.tests.day9_javaFaker_Testbase_DriverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1() {
//Creating Faker object to reach methods
        Faker faker=new Faker();
        //Faker faker=new Faker(new Locale("fr"));
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().firstName() = " + faker.name().lastName());
        System.out.println("faker.name().firstName() = " + faker.name().fullName());

        //faker.name().firstName() = Eldridge
        //faker.name().firstName() = Evette
        //faker.name().firstName() = Koss
        //faker.name().firstName() = Shirley Tillman

        String cityName=faker.address().cityName();
        String address=faker.address().fullAddress();
        System.out.println("address = " + address);
        System.out.println("cityName = " + cityName);



        //numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"312-###-####\") = "
                + faker.numerify("312-###-####"));
//faker.numerify("###-###-####") = 529-436-5785
//faker.numerify("312-###-####") = 312-580-5309


        //letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = "
                + faker.letterify("???-????"));
//faker.letterify("???-????") = qel-vgco


        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = "
                + faker.bothify("##?#-##?#-#?#?#-##??"));

        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Bülent Kaya"));

//faker.chuckNorris().fact() = Bülent Kaya's keyboard doesn't have a Ctrl key because nothing controls Bülent Kaya.
        //All arrays Bülent Kaya declares are of infinite size, because Bülent Kaya knows no bounds.


    }


}
