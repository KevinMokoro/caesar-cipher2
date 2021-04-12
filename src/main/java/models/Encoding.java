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

    public String Encrypt (String input,int key) {
        String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphabetArray = alphabet.toCharArray();
        char[] keyedAlpha = new char[25];
        String newAlphabet = Arrays.toString(keyedAlpha);
        if(alphabetArray[0] == 'A'){
            for(int indexA =0;indexA<= keyedAlpha.length;indexA++){
                keyedAlpha[indexA] = alphabetArray[key];
            }
        }
       return Arrays.toString(alphabetArray);
    }




}