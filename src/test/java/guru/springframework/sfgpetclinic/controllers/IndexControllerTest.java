package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Tag("Controller")
class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {

        controller=new IndexController();

    }
    @DisplayName("Test Name for Index")
    @Test
    void index() {

        assertEquals("index",controller.index());
        assertEquals("index",controller.index(),"This is custom message for test generated");
        System.out.println("Test is running");
    }

    @DisplayName("OutPut Handler Test cases")
    @Test
    void oupsHandler() {
        assertTrue("notimplemented".equals(controller.oupsHandler()),() -> "This is custom generated message using lambda expression");
    }
}