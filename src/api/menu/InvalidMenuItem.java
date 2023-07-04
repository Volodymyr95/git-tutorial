package api.menu;

public class InvalidMenuItem extends MenuItem {

    @Override
    public void action() {
        System.out.println("Incorrect input");
    }
}
