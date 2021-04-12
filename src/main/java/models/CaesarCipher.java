package models;

public class CaesarCipher{
    private String input;
    private String output;

    public CaesarCipher(String input, String output) {
        this.input = input;
        this.output = output;

    }


    public String getInput() {
        return this.input;
    }

    public String getOutput() {
        return this.output;
    }

}
