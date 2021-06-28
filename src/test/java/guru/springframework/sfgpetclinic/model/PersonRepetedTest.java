package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.services.springdatajpa.ModelTests;
import guru.springframework.sfgpetclinic.services.springdatajpa.ModelrepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepetedTest implements ModelrepeatedTest {

    @RepeatedTest(value = 5,name = "{displayName} : {currentRepetition} | {totalRepetitions}")
    @DisplayName("My Assignment test")
    void myassignment() {

    }

    @RepeatedTest(5)
    void Repetedtest(TestInfo testInfo, RepetitionInfo repetitionInfo){

        System.out.println(testInfo.getDisplayName() + ":" + repetitionInfo.getCurrentRepetition() + ":" + repetitionInfo.getTotalRepetitions());

    }
}
