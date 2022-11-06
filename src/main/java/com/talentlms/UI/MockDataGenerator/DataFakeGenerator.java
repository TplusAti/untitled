package com.talentlms.UI.MockDataGenerator;

import com.github.javafaker.Faker;

public class DataFakeGenerator {


    Faker faker = new Faker();

    public String addFirstName (){
        return faker.name().firstName();
    }
    public String addLastname (){
        return faker.name().lastName();
    }
    public String addEmail (){
        return faker.internet().emailAddress();
    }
    public String addPassword (){
        return faker.internet().password(8,10,true,true,true);
    }
    public String addBio (){
        return faker.chuckNorris().fact();
    }
    public String addUserName (){
        return faker.name().username();
    }
    public String password = "QwerT123$";

}
