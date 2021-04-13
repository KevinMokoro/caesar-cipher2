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




    Encoding newInstanceInClass = new Encoding("HI","JK",2);
    int key = newInstanceInClass.getKey();
    String inputFrom = newInstanceInClass.getUseOutput();
    String outPutTo = newInstanceInClass.getUserInput();


    public String decrypt(Encoding inputFromClass,CaesarCipher outPutTo) {



        CaesarCipher newInstance = new CaesarCipher("","");
        String inputFrom = newInstance.getInput();
        String outputTo = newInstance.getOutput();
        for (int indexO = 0; indexO < inputFrom.length(); indexO++) {
           char letter =  inputFrom.charAt(indexO);
            if (letter >= 'A' && letter <= 'Z') {
                letter = (char)(letter - key);
                if (letter < 'A') {
                    letter = (char) (letter - 'A' + 'Z' + 1);
                }
                outputTo = outputTo + letter;

            }


        }

        return outputTo;
    }

}

