package models;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

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

    @Test
    void volume_determinesTheVolumeOfTheCube_27000() {
        Rectangle testRectangle= new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(27000, testCube.getVolume());
    }

    @Test
    void surfaceArea_determinesTheSurfaceAreaOfCube_5400() {
        Rectangle testRectangle= new Rectangle(30,30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(5400, testCube.getSurfaceArea());
    }
}