package models;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.concurrent.Callable;

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

    @Test
    public void getKey_getsEncodeKey_int() {
        Encoding testEncoding = new Encoding("ABB","CDD",2);
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void encrypt_isAbleToIdentifyChar_String() {
        Encoding testEncoding = new Encoding("ABB", "CDD", 2);
        String userMessage = testEncoding.getUserInput();
        char[] userArrayWords = userMessage.toCharArray();
        assertEquals('A',userArrayWords[0]);
    }

    @Test
    public void encrypt_ableToFindUserCharAtAlphabet_String() {
        Encoding testEncoding = new Encoding("ABB","CDD",2);
        String userItem = testEncoding.getUserInput();
        assertEquals('B',userItem.charAt(1));
    }

   @Test
   public void encrypt_isAbleToAbleToCompareCharsInAlteredAlphabetWithKey() {
       Encoding testEncoding = new Encoding("ABB","CDD",2);
        String userEntry =testEncoding.getUserInput();
       int key = testEncoding.getKey();
        testEncoding.encrypt(userEntry, key);
        assertTrue(userEntry.equalsIgnoreCase("ABB"));

    }

    @Test
    public void getExpectedOutPut_predictsTheOutput_String() {
        Encoding newInstance = new Encoding("HI","JK",2);
        String output = newInstance.getUseOutput();
        assertEquals( output, newInstance.encrypt("HI",2));
    }
}