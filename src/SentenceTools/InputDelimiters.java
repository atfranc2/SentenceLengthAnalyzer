package SentenceTools;

import java.util.Arrays;
import java.util.Scanner;

public class InputDelimiters implements InputDelimitersInterface {

    private String[] validSentenceDelimiters = {".", "!", "?", ",", "/"};

    private String[] addElement(String[] list, String element){
        int originalLength = list.length;
        int newLength = originalLength+1;
        String[] newArray = new String[newLength];

        if (newLength > 1) {
            for (int i = 0; i < newLength-1; i++)
                newArray[i] = list[i];
        }

        newArray[newLength-1] = element;
        return newArray;
    }

    private String[] parseInput(String input){

        String[] delimiters = {};

        for (String delimiter : input.split(" ")){
            delimiters = addElement(delimiters, delimiter);
        }
        return delimiters;
    }

    private boolean contains(String stringToCheck){
        boolean isIn = false;
        for (String value : validSentenceDelimiters) {
            if (value.equals(stringToCheck)){
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    private void checkDelimiters(String[] delimiters) throws InvalidDelimiterException{
        for (String value : delimiters){
            if (!contains(value)){
                throw new InvalidDelimiterException(value);
            }
        }
    }

    @Override
    public String[] inputDelimiters() throws InvalidDelimiterException{
        Scanner delimiterInput = new Scanner(System.in);
        System.out.println("Enter Your Sentence Delimiters Separated with Spaces: ");
        String input = delimiterInput.nextLine();
        String[] delimiters = parseInput(input);
        checkDelimiters(delimiters);
        return delimiters;
    }
}
