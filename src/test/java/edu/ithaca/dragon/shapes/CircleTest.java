package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }


    
}
