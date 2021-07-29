package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void neRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2,4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    void newRectangle_getLength_2() {
        Rectangle testRectangle= new Rectangle(2,4);
        assertEquals(2, testRectangle.getLength());
    }
    @Test
    void newRectangle_getWidth_4() {
        Rectangle testRectangle= new Rectangle(2,4);
        assertEquals(4, testRectangle.getWidth());
    }
    @Test
    void isSquare_whenNotsquare_false() {
        Rectangle testRectangle= new Rectangle(2,4);
       assertEquals(false,testRectangle.isSquare());
    }
    @Test
    void isSquare_whensquare_true() {
        Rectangle testRectangle= new Rectangle(2,2);
        assertEquals(true,testRectangle.isSquare());
    }

}