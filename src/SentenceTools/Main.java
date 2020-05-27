package SentenceTools;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){

        // Test File: C:\Users\Owner\MyFiles\TestDoc.txt
        var fileImporter = new ImportFile(new ReadFile(), new InputFilePath());

        var fileAnalyzer = new AnalyzeFile(fileImporter, new InputDelimiters(), new MeasureSentences());
        fileAnalyzer.analyzeFile(3);

    }

}
