package SentenceTools;

public class InputDelimiters implements InputDelimitersInterface {

    private String[] validSentenceDelimiters = {".", "!", "?", ",", "/"};

    private boolean checkDelimiters(String[] delimiters){
        return true; 
    }

    @Override
    public String inputDelimiters() {
        return "yes";
    }
}
