package SentenceTools;

import java.io.File;

public class ReadFile {

    private File file;

    public void importFile(InputFilePath filePath){
        this.file = new File(filePath.getFilePath());
    }



}
