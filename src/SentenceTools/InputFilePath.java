package SentenceTools;

import java.util.Scanner;

public class InputFilePath {

    private String filePath;

    public InputFilePath(){
        inputPath();
    }

    public void inputPath() {
        Scanner scan = new Scanner(System.in);
        String filePath = "";
        boolean isValidPath = false;


        while (!isValidPath) {
            System.out.println("File Path: ");
            filePath = scan.nextLine();
            isValidPath = checkFilePath(filePath);
        }

        this.filePath = filePath;
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

    public String getFilePath(){
        return this.filePath;
    }

}
