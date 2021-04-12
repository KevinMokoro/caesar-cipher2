package models;

import java.util.Arrays;

public class Encoding{
    private String userInput;
    private String userOutput;
    private int key;

    public Encoding(String userInput,String userOutput,int key) {
        this.userInput = userInput;
        this.userOutput = userOutput;
        this.key = key;

    }

    public String getUserInput() {
        return this.userInput;
    }

    public String getUseOutput() {
        return this.userOutput;
    }

    public int getKey() {
        return this.key;
    }

    public String encrypt (String input,int key) {
        String wholeAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newEncryptedAlphabet = "";

        char alphabet;
        for(int i = 0; i <wholeAlphabet.length();i++){
            alphabet = wholeAlphabet.charAt(i);
            if(alphabet >= 'A' && alphabet <= 'Z'){
                alphabet = (char)(alphabet+key);
                if(alphabet > 'Z'){
                    alphabet = (char)(alphabet+'A'-'Z'-1);
                }
                newEncryptedAlphabet = newEncryptedAlphabet + alphabet;
            }
        }

        char[] encryptResult = input.toCharArray();
        for (int index = 0; index < encryptResult.length; index++) {
            char currentCharacter = encryptResult[index];
            int theIndexInTheAlphabet = wholeAlphabet.indexOf(currentCharacter);
            if(theIndexInTheAlphabet != -1){
                char newChar = newEncryptedAlphabet.charAt(theIndexInTheAlphabet);
                encryptResult[index] = newChar;
            }
        }


        return Arrays.toString(encryptResult);
    }

}
