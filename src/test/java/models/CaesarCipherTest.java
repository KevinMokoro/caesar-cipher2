package models;

import org.junit.*;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testCaesarCipher = new CaesarCipher("ab", "cd");
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }
}