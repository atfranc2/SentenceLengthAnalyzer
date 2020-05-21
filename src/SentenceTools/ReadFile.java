package SentenceTools;

import java.io.File;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class ReadFile implements ReadFileInterface{

    private String[] fileContent;

    private void addLine(String newLine){

        int numberOfElements = fileContent.length;
        String[] newArray = new String[numberOfElements+1];
        for (int i = 0; i < numberOfElements; i++)
            newArray[i] = fileContent[i];

        newArray[numberOfElements] = newLine;
        fileContent = newArray;

    }

    @Override
    public String parse(String filePath) {

        File fileReader = new File(filePath);
        fileContent = new String[] {};

        try {
            Scanner myReader = new Scanner(fileReader);
            while (myReader.hasNextLine())
                addLine(myReader.nextLine());
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return String.join(" ", fileContent);
    }



}
