package box.selenium;

import com.github.javafaker.Faker;

public class Example {
    public static void main(String[] args) {
        Faker faker=new Faker();
        System.out.println(faker.name().fullName());

        System.out.println("Hello world!");

    }

}
