package models;

import org.junit.*;

import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void newEncoding_instantiatesCorrectly() {
        Encoding testEncoding = new Encoding("ab","cd",2);
        assertEquals(true,testEncoding instanceof Encoding);
    }

    @Test
    public void newEncoding_getsUserInput_String() {
        Encoding testEncoding = new Encoding("abb","cdd",2);
        assertEquals("abb",testEncoding.getUserInput());
    }

    @Test
    public void getUserOutput_getsEncodedOutput_String() {
        Encoding testEncoding = new Encoding("abb", "cdd",2);
        assertEquals("cdd",testEncoding.getUseOutput());
    }
}