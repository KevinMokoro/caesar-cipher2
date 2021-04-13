package models;

public class CaesarCipher {
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


    Encoding newInstance = new Encoding("HI", "JK", 2);
    String messageOutput = newInstance.userExpectedOutPut();
    int key = newInstance.getKey();


    public String decrypt(String userOutputted, int key) {

        String outGoing = messageOutput;
        String encryptedAlphabet = "";
        for (int indexO = 0; indexO < outGoing.length(); indexO++) {
           char letter =  outGoing.charAt(indexO);
            if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter - key);
                if (letter < 'A') {
                    letter = (char) (letter - 'A' + 'Z' + 1);
                }
                encryptedAlphabet = encryptedAlphabet + letter;

            }


        }
        return encryptedAlphabet;
    }
}

