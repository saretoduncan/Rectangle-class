package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void neRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2,4);
        assertTrue(true);
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
        assertFalse(testRectangle.isSquare());
    }
    @Test
    void isSquare_whensquare_true() {
        Rectangle testRectangle= new Rectangle(2,2);
        assertTrue(testRectangle.isSquare());
    }

    @Test
    void newRectangleArea() {
        Rectangle testRectangleArea= new Rectangle(2,2);
        assertEquals(4,testRectangleArea.getArea());
    }

    @Test
    void all_returnsAllInstancesOfRectangle_true() {
        Rectangle firstRectangle= new Rectangle(2,10);
        Rectangle secondRectangle= new Rectangle(5,6);
        assertTrue(Rectangle.getAll().contains(firstRectangle));
        assertTrue(Rectangle.getAll().contains(secondRectangle));
    }
}