package models;

public class Encoding{
    private String userInput;
    private String userOutput;

    public Encoding(String userInput,String userOutput,int key) {
        this.userInput = userInput;
        this.userOutput = userOutput;

    }

    public String getUserInput() {
        return this.userInput;
    }

    public String getUseOutput() {
        return this.userOutput;
    }
}