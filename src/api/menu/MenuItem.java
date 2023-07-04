package api.menu;

import api.CeaserCypher;
import api.FilePathNotValid;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MenuItem { //Abstraction
    protected static boolean isRunning = true;
    protected final CeaserCypher ceaserCypher = new CeaserCypher();

    public void action() {
        System.out.println("Connection");
    }

    protected String validateFilePath() {
        Scanner scannerForFileName = new Scanner(System.in);
        System.out.println("Provide path to file: ");
        String filePath = scannerForFileName.nextLine();
        if (!Files.exists(Path.of(filePath))) {
            throw new FilePathNotValid("Invalid file path");
        }
        return filePath;
    }
}
