package api.menu;

import api.menu.*;

import java.util.HashMap;
import java.util.Scanner;

import static api.menu.MenuConstants.MENU_INFO;
import static api.menu.MenuItem.isRunning;

public class Menu {
    private static final int EXIT_NUMBER = 0;
    private static final int ENCODE_FILE = 1;
    private static final int DECODE_FILE = 2;

    private HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    public Menu() {
        menuItems.put(EXIT_NUMBER, new ExitMenuItem());
        menuItems.put(ENCODE_FILE, new EncodeMenuItem());
        menuItems.put(DECODE_FILE, new DecodeMenuItem());
    }

    final Scanner scanner = new Scanner(System.in);

    public void run() {

        while (isRunning) {
            System.out.println(MENU_INFO);
            String userInput = scanner.nextLine();
            MenuItem menuItem = menuItems.getOrDefault(parseUserInput(userInput), new InvalidMenuItem());
            menuItem.action();
        }
    }

    private int parseUserInput(String input) {
        return 0;
    }
}
