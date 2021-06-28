package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.fauxspring.ModelMap;
import guru.springframework.sfgpetclinic.services.springdatajpa.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Tag("modle")
class PersonTest implements ModelTests {

    @Test
    void getgroupassert() {

        Person person=new Person(1l,"Anand","Kumar");

        assertAll("test Prop set",
        ()-> assertEquals("Anand",person.getFirstName()),
        ()-> assertEquals("Kumar",person.getLastName()));

    }


    @Test
    void validatetest(){

        Person person=new Person(1l,"Anand","Kumar");
        assertEquals("Kumar",person.getLastName());
        assertEquals("Anand",person.getFirstName(),"In Case test case gets fail the generate User define error message");
        assertNotEquals("qnand",person.getFirstName(),"In Case test get failed please show user define error");
    }

    @Test
    void getgroupassert1() {

        Person person=new Person(1l,"Anand","Kumar");

        assertAll("test Prop set",
                ()-> assertEquals("Anand",person.getFirstName(),"custom design Error message for failed"),
                ()-> assertEquals("Kumar",person.getLastName(),"customize error message for last name for failed"));

    }


}