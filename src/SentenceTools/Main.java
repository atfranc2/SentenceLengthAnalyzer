package SentenceTools;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){

        // Test File: C:\Users\Owner\MyFiles\TestDoc.txt
        var rawFile = new ImportFile(new ReadFile(), new InputFilePath()).importFile();
        System.out.println(rawFile);

    }

}
