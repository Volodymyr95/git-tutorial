package api.menu;

public class DecodeMenuItem extends MenuItem{
    @Override
    public void action() {
        ceaserCypher.decode(validateFilePath());
    }
}
