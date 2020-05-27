package SentenceTools;

public class AnalyzeFile {

    private InputDelimitersInterface inputDelimiters;
    private ImportFileInterface importFile;
    private MeasureSentencesInterface measureSentences;

    public AnalyzeFile(ImportFileInterface importFile,
                       InputDelimitersInterface inputDelimiters,
                       MeasureSentencesInterface measureSentences){

        this.inputDelimiters = inputDelimiters;
        this.importFile = importFile;
        this.measureSentences = measureSentences;
    }

    public void analyzeFile(int minimumSentenceLength){

        try {
            String fileContent = importFile.importFile();
            String[] delimiters = inputDelimiters.inputDelimiters();

            measureSentences.setFileContent(fileContent);
            measureSentences.setSentenceDelimiters(delimiters);

            float averageSentenceLength = measureSentences.calculateAverageSentenceLength(minimumSentenceLength);
            System.out.println("The average length of your sentences is: " + averageSentenceLength + " words.");

        }
        catch (InvalidDelimiterException ex){
            System.out.println(ex.getMessage());
        }

    }
}
