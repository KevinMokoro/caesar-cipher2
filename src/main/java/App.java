
import models.CaesarCipher;
import models.Encoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        boolean onGoingActivity = true;

        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));


        System.out.println("You're Here With Your Secret Ciphers.Ok Welcome..");
        System.out.println("First enter your whole sentence in uppercase.");
        try {
            String userSentence = bufferedReader.readLine();
            System.out.println("Alright give me a number you'll like to encrypt your sentence with");
            int userNumber = Integer.parseInt(bufferedReader.readLine());
            Encoding newEncoding = new Encoding(userSentence, "", userNumber);

            String encryptedOutput = newEncoding.encrypt(userSentence, userNumber);

            System.out.println("Input String: " + userSentence);
            System.out.println("Encrypted String: " + encryptedOutput);
            System.out.println("Decrypted String: " + userSentence);
            while (onGoingActivity) {
                System.out.println("Would you like to try another phrase?Select Yes or Exit");
                String userOption = bufferedReader.readLine();
                if (userOption.equals("Yes")) {
                    System.out.println("Enter Phrase in Uppercase letters");
                    String userPhrase = bufferedReader.readLine();
                    System.out.println("Enter A number You Would like To Encrypt To: ");
                    int userNumber2 = Integer.parseInt(bufferedReader.readLine());
                    Encoding newInstanceEncoding = new Encoding("", "", 1);
                    String userEncrypted = newInstanceEncoding.encrypt(userPhrase, userNumber2);
                    System.out.println("Input String :" + userPhrase);
                    System.out.println("Encrypted String :" + userEncrypted);
                    System.out.println("Decrypted String :" + userPhrase);
                }
                else if (userOption.equals("Exit")) {
                    onGoingActivity = false;
                }else{
                    System.out.println("Sorry i could pick up what you entered.Invalid,try again.");
                }
            }

            } catch(IOException e){
                e.printStackTrace();
            }

        }
  }

