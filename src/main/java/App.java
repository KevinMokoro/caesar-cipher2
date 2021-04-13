
import models.CaesarCipher;
import models.Encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("You're Here With Your Secret Ciphers.Ok Welcome..");
        System.out.println("First enter your whole sentence in uppercase.");
        try {
            String userSentence = bufferedReader.readLine();
            System.out.println("Alright give me a number you'll like to encrypt your sentence with");
            int userNumber = Integer.parseInt(bufferedReader.readLine());
            Encoding newEncoding = new Encoding(userSentence,"",userNumber);

            String encryptedOutput = newEncoding.encrypt(userSentence,userNumber);

            System.out.println("Input String: " + userSentence);
            System.out.println("Encrypted String: " + encryptedOutput);
            System.out.println("Decrypted String: "+ userSentence);










        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}