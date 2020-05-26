package SentenceTools;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile implements ReadFileInterface{

    private Scanner openFile(String filePath) throws IOException {
        File fileReader = new File(filePath);
        return new Scanner(fileReader);
    }


    private int checkFileLength(Scanner myReader) {
        int lines = 0;
        boolean endOfFile = false;

        while(!endOfFile) {
            var hasNextLine = myReader.hasNextLine();
            if (hasNextLine) {
                lines++;
                myReader.nextLine();
            }
            else
                endOfFile = true;
        }

        return lines;
    }

    private String[] readFile(Scanner file, int fileLength) {

        String[] fileContent = new String[fileLength];
        for (int i = 0; i < fileLength; i++){
            var line = file.nextLine();
            fileContent[i] = line;
        }

        return fileContent;
    }


    @Override
    public String parse(String filePath) {

        String[] fileContent = null;

        try (Scanner myReader = openFile(filePath)) {
            int fileLength = checkFileLength(myReader);
            Scanner newFile = openFile(filePath);
            fileContent = readFile(newFile, fileLength);
            newFile.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return String.join(" ", fileContent);
    }

}
