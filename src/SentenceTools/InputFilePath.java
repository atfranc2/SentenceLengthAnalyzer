package SentenceTools;

import java.util.Scanner;

public class InputFilePath implements InputFilePathInterface {

    @Override
    public String inputPath() {
        Scanner scan = new Scanner(System.in);
        String filePath = "";
        boolean isValidPath = false;


        while (!isValidPath) {
            System.out.println("File Path: ");
            filePath = scan.nextLine();
            isValidPath = checkFilePath(filePath);
        }

        return filePath;
    }

    // Verifies that file path is a valid one
    private boolean checkFilePath(String filePath){
        boolean isValidFile = false;
        String[] validPathExtensions = new String[] {".txt"};

        for (String pathExtension : validPathExtensions){
            isValidFile = filePath.contains(pathExtension);
            if (isValidFile)
                break;
        }

        if (!isValidFile)
            System.out.println("Invalid file type entered. Specify a valid file type");

        return isValidFile;
    }

}
