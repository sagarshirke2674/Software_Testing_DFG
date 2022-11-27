import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.InputStream;
//import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_sci_calc {

    Calc calculator;
    Menus menus;

    @BeforeEach
    void setup() {
        calculator = new Calc();
        menus = new Menus();
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,3,5,6]")
    public void testFact1() {
        assertEquals(1, calculator.fact(1));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,3,4,3,5,6]")
    public void testFact2()
    {
        assertEquals(2,calculator.fact(2));
    }

    @Test
    @DisplayName("fact()=>follows path [1,2,3,4,3,4,3,5,6]")
    public void testFact3()
    {
        assertEquals(120,calculator.fact(5));
    }
}