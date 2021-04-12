package models;

import org.junit.*;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void newCaesarCipher_instantiatesCorrectly() {
        CaesarCipher testCaesarCipher = new CaesarCipher("ab", "cd");
        assertEquals(true,testCaesarCipher instanceof CaesarCipher);
    }

    @Test
    public void newCaesarCipher_getsInput_String() {
        CaesarCipher testCaesaeCipher = new CaesarCipher("ab","cd");
        assertEquals("ab",testCaesaeCipher.getInput());


    }

    @Test
    public void getOutPut_getsCaesarCipherOutput_String() {
        CaesarCipher testCaesar = new CaesarCipher("ab","cd");
        assertEquals("cd", testCaesar.getOutput());
    }
}