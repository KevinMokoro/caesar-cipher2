package models;

import org.junit.*;

import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void newEncoding_instantiatesCorrectly() {
        Encoding testEncoding = new Encoding("ab","cd",2);
        assertEquals(true,testEncoding instanceof Encoding);
    }
}