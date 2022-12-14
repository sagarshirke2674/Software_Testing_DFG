import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.InputStream;
//import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_sci_calc {

    int[] arr1={};
    int[] arr2={1};
    int[] arr3={1,2,3,4};
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

    @Test
    @DisplayName("binaryToHexa()=>follows path [1,2,7]")
    public void testBinToHexa1()
    {
        assertEquals("",calculator.binaryToHexa(""));
    }

    @Test
    @DisplayName("binaryToHexa()=>follows path [1,2,3,4,5,4,6,2,7]")
    public void testBinToHexa2()
    {
        assertEquals("1",calculator.binaryToHexa("1"));
    }

    @Test
    @DisplayName("binaryToHexa()=>follows path [1,2,3,4,5,4,5,4,6,2,7]")
    public void testBinToHexa3()
    {
        assertEquals("2",calculator.binaryToHexa("10"));
    }

    @Test
    @DisplayName("power()=>follows path [1,2,4,7,9]")
    public void testPower1()
    {
        assertEquals(1,calculator.pow(2,0));
    }

    @Test
    @DisplayName("pow()=>follows path [1,2,3,10,5,6,2,4,7,8]")
    public void testPower2()
    {
        assertEquals(0.5,calculator.pow(2,-1));
    }

    @Test
    @DisplayName("pow()=>follows path [1,2,3,10,5,6,2,4,7,9]")
    public void testPower3()
    {
        assertEquals(2,calculator.pow(2,1));
    }

    @Test
    @DisplayName("pow()=>follows path [1,2,3,10,5,6,2,3,10,5,6,2,4,7,8]")
    public void testPower4()
    {
        assertEquals(0.125,calculator.pow(2,-3));
    }

    @Test
    @DisplayName("decimalToOctal()=>follows path [1,2,4]")
    public void testDecToOctal1()
    {
        assertEquals("7",calculator.decimalToOctal(7));
    }

    @Test
    @DisplayName("decimalToOctal()=>follows path [1,2,3,2,4]")
    public void testDecToOctal2()
    {
        assertEquals("12",calculator.decimalToOctal(10));
    }

    @Test
    @DisplayName("decimalToOctal()=>follows path [1,2,3,2,3,2,4]")
    public void testDecToOctal3()
    {
        assertEquals("244",calculator.decimalToOctal(164));
    }

    @Test
    @DisplayName("addArrElements()=>follows path [1,2,3,5,6]")
    public void testArrAdd1() {
        assertEquals(0, calculator.addArrElements(arr1));
    }

    @Test
    @DisplayName("addArrElements()=>follows path [1,2,3,4,3,5,6]")
    public void testArrAdd2()
    {
        assertEquals(1,calculator.addArrElements(arr2));
    }

    @Test
    @DisplayName("addArrElements()=>follows path [1,2,3,4,3,4,3,5,6]")
    public void testArrAdd3()
    {
        assertEquals(10,calculator.addArrElements(arr3));
    }

}