import keys.Key;
import keys.MoveOn3PointsKey;
import keys.MoveOn4PointsKey;
import keys.MoveOn5PointsKey;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Menu {
    private static final int EXIT_NUMBER = 0;
    private static final int DECODE_FILE = 1;
    private static final int ENCODE_FILE = 2;
    private static final String MENU_INFO =
            """
                    1. Encode
                    2. Decode
                    0. Exit
                                     
                    """;

    private static final String OPTIONS_FOR_CRYPT =
            """
                    1. Move letter on 3 points
                    2. Move letter on 5 points
                    3. Move letter on 4 points
                    """;
    private static boolean isRunning = true;

    final CeaserCypher ceaserCypher = new CeaserCypher();
    final Scanner scanner = new Scanner(System.in);

    public void run() {

        while (isRunning) {
            System.out.println(MENU_INFO);
            int menuItem = scanner.nextInt();

            switch (menuItem) {
                case ENCODE_FILE -> itemToEncodeFile();
                case DECODE_FILE -> itemToDecodeFile();
                case EXIT_NUMBER -> itemToExit();
            }
        }
    }

    private void itemToEncodeFile() {
        System.out.println(OPTIONS_FOR_CRYPT);
        var encodingScanner = new Scanner(System.in);
        int input = encodingScanner.nextInt();

        Key key = switch (input) {
            case 1 ->  new MoveOn3PointsKey();
            case 2 -> new MoveOn5PointsKey();
            case 3 -> new MoveOn4PointsKey();
            default -> null;
        };

        ceaserCypher.encode(validateFilePath(), key);
    }

    private void itemToDecodeFile() {
        ceaserCypher.decode(validateFilePath());
    }

    private void itemToExit() {
        isRunning = false;
        System.out.println("Bye Bye!");
    }

    private String validateFilePath() {
        Scanner scannerForFileName = new Scanner(System.in);
        System.out.println("Provide path to file: ");
        String filePath = scannerForFileName.nextLine();
        if (!Files.exists(Path.of(filePath))) {
            throw new FilePathNotValid("Invalid file path");
        }
        return filePath;
    }
}
