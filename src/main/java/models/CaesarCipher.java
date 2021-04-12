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

    Encoding newInstance = new Encoding("HI","JK",2);
    String messageOutput = newInstance.getUseOutput();
    public String decrypt( ){
        return "";

    }

}
