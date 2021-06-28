package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.CustomeProvierargs;
import guru.springframework.sfgpetclinic.services.springdatajpa.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {

    @Test

    void dependentassertion(){

        Owner owner=new Owner(1l,"Anand","Kumar");
        owner.setCity("Mumbai");
        owner.setTelephone("12345676787");

        assertAll("Properties Test",
        () -> assertAll("Person Properties" ,
                () -> assertEquals("Anand",owner.getFirstName(),"First Name did not match"),
                ()-> assertEquals("Kumar",owner.getLastName(),"last Name did not match")),
                () -> assertAll("Owner Properties",
                        ()-> assertEquals("Key west",owner.getCity(),"Owner city did not match"),
                        ()-> assertEquals("123423",owner.getTelephone())
                        ));

        assertEquals(owner.getCity(),"Mumbai");
    }
    @DisplayName("Test is Running")
    @ParameterizedTest(name = "{displayName},-[{index}],{arguments}")
    @ValueSource(strings = {"Spring","Framework","Learning"})
    void testvalueSource(String val){

        System.out.println(val);
    }

    @DisplayName("Enum Test is Running")
    @ParameterizedTest(name ="{displayName},-[{index}],{arguments}")
    @EnumSource(OwnerType.class)
     void enumtest(OwnerType ownerType){

        System.out.println(ownerType);
    }

    @DisplayName("CSV Source Test is Running")
    @ParameterizedTest(name ="{displayName},-[{index}],{arguments}")
    @CsvSource({"UP,1,1","MP,1,2","MH,1,3"})
    void CSVSourceTes(String stateName, int val,int val1){
        System.out.println(stateName + "-" + val + ":" + val1 );
    }

    @DisplayName("CSV file Source Test is Running")
    @ParameterizedTest(name ="{displayName},-[{index}],{arguments}")
    @CsvFileSource(resources ="/input.csv",numLinesToSkip = 1)
    void CSVFileSourceTes(String stateName, int val,int val1){
        System.out.println(stateName + "-" + val + ":" + val1 );
    }

    @DisplayName("Method Source Test is Running")
    @ParameterizedTest(name ="{displayName},-[{index}],{arguments}")
   @MethodSource("argmnts")
    void MethodSourceTes(String stateName, int val,int val1){
        System.out.println(stateName + "-" + val + ":" + val1 );
    }

    static Stream<Arguments> argmnts(){

        return Stream.of(Arguments.of("DL",1,3),
                Arguments.of("BR",4,3),
                Arguments.of("GA",6,3));
    }

    @DisplayName("Custom Class Source Test is Running")
    @ParameterizedTest(name ="{displayName},-[{index}],{arguments}")
    @ArgumentsSource(CustomeProvierargs.class)
    void Customearguments(String stateName, int val,int val1){
        System.out.println(stateName + "-" + val + ":" + val1 );
    }

}