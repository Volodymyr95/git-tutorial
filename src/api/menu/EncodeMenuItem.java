package api.menu;

import api.keys.Key;
import api.keys.MoveOn3PointsKey;
import api.keys.MoveOn4PointsKey;
import api.keys.MoveOn5PointsKey;

import java.util.Scanner;

import static api.menu.MenuConstants.OPTIONS_FOR_CRYPT;

public class EncodeMenuItem extends MenuItem {

    @Override
    public void action() {
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
}
