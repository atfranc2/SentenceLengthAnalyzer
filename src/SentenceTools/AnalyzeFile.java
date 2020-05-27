package SentenceTools;

public class AnalyzeFile {

    private String[] delimiters;

    private InputDelimitersInterface inputDelimiters;

    public AnalyzeFile(InputDelimitersInterface inputDelimiters){
        this.inputDelimiters = inputDelimiters;
    }

    public void analyzeFile(){

        try {
            String[] delimiters = inputDelimiters.inputDelimiters();

        }
        catch (InvalidDelimiterException ex){
            System.out.println(ex.getMessage());
        }

    }
}
