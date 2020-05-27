package SentenceTools;

public class ImportFile implements ImportFileInterface{

    private ReadFileInterface readFile;
    private InputFilePathInterface inputFilePath;

    public ImportFile(ReadFileInterface readFile,
                      InputFilePathInterface inputFilePath){

        this.readFile = readFile;
        this.inputFilePath = inputFilePath;

    }

    @Override
    public String importFile() {
        String filePath = inputFilePath.inputPath();
        return readFile.parse(filePath);
    }

}
