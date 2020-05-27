package SentenceTools;

import java.util.Arrays;

public class ImportFile {

    private ReadFileInterface readFile;
    private InputFilePathInterface inputFilePath;

    public ImportFile(ReadFileInterface readFile,
                      InputFilePathInterface inputFilePath){

        this.readFile = readFile;
        this.inputFilePath = inputFilePath;

    }

    public String importFile() {
        String filePath = inputFilePath.inputPath();
        return readFile.parse(filePath);
    }

}
