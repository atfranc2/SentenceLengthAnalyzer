package SentenceTools;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){

        var rawFile = new ImportFile(new ReadFile(), new InputFilePath()).importFile();
        System.out.println(rawFile);

    }

}
