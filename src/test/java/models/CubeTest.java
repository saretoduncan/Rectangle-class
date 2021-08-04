package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {
    @Test
    void newCube_instantiatesCorrectly() {
        Rectangle tesRectangle= new Rectangle(30,30);
        Cube testCube= new Cube(tesRectangle);
        assertTrue(true);
    }

    @Test
    void  newCUbe_savesRectangleInformation_Rectangle() {
        Rectangle testRectangle= new Rectangle(30,30);
        Cube testCube =new Cube(testRectangle);
        assertEquals(testRectangle,testCube.getFace());
    }
}