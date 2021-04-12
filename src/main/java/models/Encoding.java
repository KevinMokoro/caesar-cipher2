package models;

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
}